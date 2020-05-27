package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Annonce;


public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// CONNEXION A LA BASE SQL
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// RECUPERER LISTE DES 3 DERNIERES ANNONCES		
		String hql = "FROM Annonce A ORDER BY A.id DESC";	 
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(3);		 
		List<Annonce> AnnoncesCarousel = query.list();
		session.getTransaction().commit();	      
		session.close();
		
		// ENVOYE DE LA LISTE DE 3 ANNONCES A LA JSP
		HttpSession sessionCarousel = request.getSession();
		request.setAttribute("AnnoncesCarousel", AnnoncesCarousel);
		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
