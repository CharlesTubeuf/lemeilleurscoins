package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Annonce;

public class AnnonceSelectionner extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 	RECUP L'ID DE LANNONCE SUR LAQUELLE ON CLIQUE
		int annonceId = Integer.parseInt(request.getParameter("annonceId"));
		
		// RECUP L'ANNONCE DE CORRESPONDANT à L'ID
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		beans.Annonce annonceSelect = session.get(Annonce.class,annonceId);
		
		//  ENVOIE L'ANNONCE VOULU PAR SESSION POUR LA RECUP EN JSP
		HttpSession sessionAnnonceSelect = request.getSession();
		request.setAttribute("annonceSelect", annonceSelect);
		
		
		this.getServletContext().getRequestDispatcher("/annonceSelectionner.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
