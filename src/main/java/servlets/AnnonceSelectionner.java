package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Annonce;
import beans.VilleFrance;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class AnnonceSelectionner extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 	RECUP L'ID DE LANNONCE SUR LAQUELLE ON CLIQUE
//		int annonceId = Integer.parseInt(request.getParameter("annonceId"));
		int annonceId = 26;
		// RECUP L'ANNONCE DE CORRESPONDANT � L'ID
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		beans.Annonce annonceSelect = session.get(Annonce.class,annonceId);
System.out.println(annonceSelect);
		//  ENVOIE L'ANNONCE VOULU PAR SESSION POUR LA RECUP EN JSP
		HttpSession sessionAnnonceSelect = request.getSession();
		request.setAttribute("annonceSelect", annonceSelect);
		
		
		
		
	
		// Recuperer la ville de l'annonce
		int codepostal = annonceSelect.getCompte().getCodePostal();
System.out.println("le code postal : "+codepostal);
		
		// recuperation de la ville dans la base de donnée de la table villes_france_free
		try {
            Class c = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver pilote = (Driver) c.newInstance();
            DriverManager.registerDriver(pilote);

            String protocole = "jdbc:mysql:";
            String ip = "127.0.0.1";
            String port = "3306";
            String nomBase = "compte";
            String my8 = "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
            // Chane de connexion
            String conString = protocole + "//" + ip + ":" + port + "/" + nomBase + my8;
//            System.out.println(conString);
            // Identifiants de connexion et mot de passe
            String nomConnexion = "root"; // dpend du contexte
            String motDePasse = "pass"; // dpend du contexte
            // Connexion
System.out.println(nomConnexion);
            Connection connexion = DriverManager.getConnection(conString, nomConnexion, motDePasse);

            Statement statement = connexion.createStatement();
System.out.println("connexion faite");
            String req = "SELECT ville_latitude_deg, ville_longitude_deg FROM villes_france_free WHERE ville_code_postal LIKE '%"+codepostal+"%';";
System.out.println("string req");
            ResultSet rs = statement.executeQuery(req);
System.out.println("resultSet");
            while (rs.next()) {
    			String latitud = rs.getString("ville_latitude_deg");
    			String longitud = rs.getString("ville_longitude_deg");
    			float latitude = Float.parseFloat(latitud);
    			float longitude = Float.parseFloat(longitud);
System.out.println("latitude est : "+latitude);
System.out.println("longitude est : "+longitude);
    			HttpSession sessionGeoloc = request.getSession();
    			request.setAttribute("latitude", latitude);   			
    			request.setAttribute("longitude", longitude);
            }

            connexion.close();

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    
		
	

		

		

        // envoie de la ville en session pour recup longitude et ** pour API;
//        HttpSession sessionGeoloc = request.getSession();
//		request.setAttribute("latitude", latitude);
        
        
		this.getServletContext().getRequestDispatcher("/annonceSelectionner.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
