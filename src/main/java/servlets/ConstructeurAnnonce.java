package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Annonce;
import beans.Compte;

public class ConstructeurAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String titre = request.getParameter("titre");
        int prix = Integer.parseInt(request.getParameter("prix"));
		String categorie = request.getParameter("categorie");
		String description = request.getParameter("description");
//		String nomImage = request.getParameter("nomImage");
		
		
Annonce annonce = new Annonce("titre",5,"categorie", "description"/*,nomImage*/);
		
		System.out.println("beanAnnonceCreer");
		
    	Annonce.saveAnnonce(annonce);
    	System.out.println("beanAnnoncesauvegarder");
		
		request.setAttribute("ConstructeurAnnonce", true);
		
		this.getServletContext().getRequestDispatcher("/formulaireAnnonce.jsp").forward(request, response);
		
		
		// Le transfert d'image!
		
		

		doGet(request, response);
	}

}
