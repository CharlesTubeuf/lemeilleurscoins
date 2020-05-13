package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConstructeurAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String categorie = request.getParameter("categorie");
		String titre = request.getParameter("titre");
		int prix = Integer.parseInt(request.getParameter("prix"));
		String description = request.getParameter("description");
//		request.getParameter(trouver une technique pour recupérer les noms des photo uploader sur le serveurs..categorie.)
		
		// créer une putain d'instance d'annonce et la stocker en base avec la méthode saveAnnonce(parametres)
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
