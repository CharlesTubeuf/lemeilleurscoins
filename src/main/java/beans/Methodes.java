package beans;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Methodes {

	private static Connection connexion;
	private static Statement statement;
	
	public static void connexionSQLbase () {
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
//			System.out.println(conString);
			// Identifiants de connexion et mot de passe
			String nomConnexion = "root"; // dpend du contexte
			String motDePasse = "pass"; // dpend du contexte
			// Connexion

			connexion = DriverManager.getConnection(conString, nomConnexion, motDePasse);
			statement = connexion.createStatement();
			
		} catch (Exception e)
			{
			System.out.println("Exception : " + e.getMessage());
			}
	}

	public static boolean verifExistant(Compte compte) {
		boolean existe= false;
		
		
		try {
		String req = "SELECT * FROM compte WHERE pseudo='"+compte.getPseudo()+"';";
		
		ResultSet rs;
		rs = statement.executeQuery(req);		
		
		while (rs.next()) {
							if(compte.getPseudo().equals(rs.getString("pseudo")) )
								{
								existe=true;
								}
							}
		
		}catch (Exception e)
		{
		System.out.println("Exception : " + e.getMessage());
		}
		
		
		return existe;
	}
	public static void deconnexion() {
		try {
		connexion.close();
		}
		catch (Exception e)
		{
		System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static boolean nouveauCompte (Compte leCompte) {
	   connexionSQLbase();
	   boolean comptecreer = false;
	   if( verifExistant(leCompte) == false)
	   {
	   try {
	   String req = "INSERT INTO compte VALUES('"+ leCompte.getPseudo()+"','"+leCompte.getMail()+"','"+leCompte.getMdp()+"');";
	   statement.executeUpdate(req);
	   comptecreer = true;
	   }
	   catch (Exception e)
		{
		System.out.println("Exception : " + e.getMessage());
		}
	   }
	   else {
		   System.out.println("Le pseudo est déja utilisé...");}
	   deconnexion();
	   return comptecreer;
   }
	
	public static boolean connexionCompte(String pseudo, String mdp) {
		connexionSQLbase();
		boolean connect = false;
		try {
			String req = "SELECT * FROM compte WHERE pseudo='"+pseudo+"' AND mdp='"+mdp+"';";
			
			ResultSet rs;
			rs = statement.executeQuery(req);		
			
			while (rs.next()) {
//								if(pseudo.equals(rs.getString("pseudo")) && mdp.equals(rs.getString("mdp")) )
//									{
									connect=true;
//									}
								}			
			}	catch (Exception e)
			{
			System.out.println("Exception : " + e.getMessage());
			}	
		
		return connect;
	}
	
} // FIN DE LA CLASS METHODE