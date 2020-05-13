package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String pageCo = "co";
		request.setAttribute("pageCo", pageCo);
		
		if (connect == true) {

			HttpSession session = request.getSession();
			session.setAttribute("pseudo", pseudo);

			this.getServletContext().getRequestDispatcher("/compte.jsp").forward(request, response);
			// ouverture de la session du connecté

		} else {
			request.setAttribute("formulaireInscription", true);

			this.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
