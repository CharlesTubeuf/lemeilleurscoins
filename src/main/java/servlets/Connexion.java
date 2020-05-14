package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Compte;

public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/////////////// RECUPERE LES INFO DU FORMULAIRE DE CONNEXION
		/////////////// ///////////////////////
		String pseudo = request.getParameter("pseudo");
		String mdp = request.getParameter("mdp");
		
		
		if(pseudo == null)
		{
			pseudo = "";
			mdp = "";
		}

		boolean connect = beans.Compte.connexionCompte(pseudo, mdp);
//		String pageCo = "co";
//		request.setAttribute("pageCo", pageCo);
		
		if (connect == true) {

			// ON ENVOYE TOUTES LES DONNEES DU COMPTE
			Compte compte = Compte.getCompte(pseudo);
			HttpSession session = request.getSession();
			session.setAttribute("compte", compte);
			
			
			// AVANT ON ENVOYAIS JUSTE LE PSEUDO
//			HttpSession session = request.getSession();
//			session.setAttribute("pseudo", pseudo);

			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			// ouverture de la session du connecté

		} else {
		//	request.setAttribute("formulaireInscription", true);
			request.setAttribute("connect", connect);
			this.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
