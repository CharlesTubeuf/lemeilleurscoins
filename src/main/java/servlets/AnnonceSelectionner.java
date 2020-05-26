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

public class AnnonceSelectionner extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 	RECUP L'ID DE LANNONCE SUR LAQUELLE ON CLIQUE
		int annonceId = Integer.parseInt(request.getParameter("annonceId"));
		
		// RECUP L'ANNONCE DE CORRESPONDANT � L'ID
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		beans.Annonce annonceSelect = session.get(Annonce.class,annonceId);
		
		//  ENVOIE L'ANNONCE VOULU PAR SESSION POUR LA RECUP EN JSP
		HttpSession sessionAnnonceSelect = request.getSession();
		request.setAttribute("annonceSelect", annonceSelect);
		
		
		
		
	
		// Recuperer la ville de l'annonce
		int codepostal = annonceSelect.getCompte().getCodePostal();
		// recuperation de la ville dans la base de donnée de la table villes_france_free
		Configuration config1 = new Configuration();
		SessionFactory sessionFactory1 = config1.configure().buildSessionFactory();
		Session sessionVilleFrance = sessionFactory1.openSession();
		session.beginTransaction();

        Query query = session.createQuery("FROM VilleFrance V WHERE V.ville_code_postal=:cmpt");
        query.setParameter("cmpt", codepostal);

        List<Annonce> listAnnonces = query.list();

        session.getTransaction().commit();
        session.close();
		
		
		this.getServletContext().getRequestDispatcher("/annonceSelectionner.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
