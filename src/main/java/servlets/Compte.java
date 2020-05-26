package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Annonce;

public class Compte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessionUtilisateur = request.getSession();
		beans.Compte compte = (beans.Compte) sessionUtilisateur.getAttribute("compte");
		
		//       GENERE LA LISTE DANNONCES DU COMPTE ACTIF                        
		List<Annonce> listAnnonces =	Annonce.getListAnnonceByCompteId(compte.getId());
	
		// envoye la liste des annonce à la jsp compte
		request.setAttribute("listAnnonces", listAnnonces);
		
//		//envoye la taille de la liste d'annonce
//		int nbAnnonces = listAnnonces.size();
//		request.setAttribute("nbAnnonces",nbAnnonces);
		
		

		this.getServletContext().getRequestDispatcher("/compte.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
