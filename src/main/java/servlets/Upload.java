package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import beans.Annonce;
import services.Fichier;
import services.UploadForm;

@SuppressWarnings("serial")
public class Upload extends HttpServlet {
    public static final String ATT_FICHIER = "fichier";
    public static final String ATT_FORM    = "form";

    public static final String VUE         = "/WEB-INF/formulaireUpload.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
       /* Affichage de la page d'upload */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

    	/* Chemin vers le dossier où vous voulez enregistrer le fichier */

        String chemin = "C:\\images\\";

        //Exemple
        //String chemin = "D:\\Zone de Nix\\OneDrive\\Technique\\Workspaces\\JavaEE\\UploadFichiers\\src\\main\\webapp\\images\\";

        /* Préparation de l'objet formulaire */
        UploadForm form = new UploadForm();

        /* Traitement de la requête et récupération du bean en résultant */
        Fichier fichier = form.enregistrerFichier( request, chemin );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FICHIER, fichier );
        
        //Gestion du nouveau formulaire!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        String titre = request.getParameter("titre");
        int prix = Integer.parseInt(request.getParameter("prix"));
		String categorie = request.getParameter("categorie");
		String description = request.getParameter("description");
		
		
		System.out.println("chemin est "+chemin);
		String nomImage = chemin+form.leNomImage;
		System.out.println("le nomImage est : "+nomImage);

		
		
		Annonce annonce = new Annonce(titre,prix,categorie, description,nomImage);
		
		
    	Annonce.saveAnnonce(annonce);
    	System.out.println("beanAnnoncesauvegarder");
    	
		HttpSession sessionAnnonce = request.getSession();
		
		
		request.setAttribute("NouvelleAnnonce", annonce);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
