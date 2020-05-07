package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// connection a la base de donné , stoker les info, recupérer puis renvoyer vers
	// l'index.. pour se connecter.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/////////////////////////// RECUP DONNER FORMULAIRE
		/////////////////////////// INSCRIPTION//////////////////////////////////////

		String pseudo = request.getParameter("pseudo");
		String mail = request.getParameter("mail");
		String mdp = request.getParameter("mdp");

		/////////////////////////// INSTANCIE UN COMPTE AVEC LE FORMULAIRE
		/////////////////////////// //////////////////////////////////
		beans.Compte leCompte = new beans.Compte(pseudo, mail, mdp);

		/////////////////////////// AJOUT DU COMPTE A LA BASE SQL SI PAS EXISTANT
		/////////////////////////// /////////////////////////
		// la méthode vérifie que le pseudo n'existe pas déjà, s'il existe msg dans la
		// console et renvoi au formulaire grace au if , sinon il renvoie à la page connexion.
		boolean creer = beans.Methodes.nouveauCompte(leCompte);
		
		request.setAttribute("creer", creer);
		if (creer == false) {
			this.getServletContext().getRequestDispatcher("/inscription.jsp").forward(request, response);
		} // RENVOIE VERS LA PAGE INSCRIPTION.JSP
		else {
			this.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
