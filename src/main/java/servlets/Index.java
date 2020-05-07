package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//vérifier si la session contenant les informations du compte est non null. et proposer de se connecter ou crer un compte,
	// ou d'aller vers la page moncompte.
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// creation/recupération de la session 
//		HttpSession session = request.getSession();	
//		session.setAttribute("exemple", "vous êtes connecté !");
//		String ex = (String) session.getAttribute("exemple");
		
		
		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
