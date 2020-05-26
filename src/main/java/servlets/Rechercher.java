package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import beans.Annonce;

public class Rechercher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// RECUP LES INFO DE LA RECHERCHE
		String recherche = request.getParameter("recherche");		
		String categorie = request.getParameter("categorie");
		
		// VA CHERCHER EN BASE DE DONNER LES ANNONCES CORRESPONDANTES	
			Configuration config = new Configuration();
			SessionFactory sessionFactory = config.configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			List<Annonce> AnnoncesRechercher = session.createQuery("FROM Annonce A WHERE A.titre  LIKE '%"+
			recherche+"%' OR A.description LIKE '%"+recherche+"%' AND A.categorie LIKE '"+categorie+"'").list();
			for (Annonce a : AnnoncesRechercher)
				System.out.println(a);
			session.getTransaction().commit();	      
			session.close();
			
			HttpSession sessionRecherche = request.getSession();
			request.setAttribute("AnnoncesRechercher", AnnoncesRechercher);
		
		
		
		
		
		
		
		
		
		
		
		
		
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
