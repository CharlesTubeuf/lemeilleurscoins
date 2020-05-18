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

    	/* Chemin vers le dossier oÃ¹ vous voulez enregistrer le fichier */

        String chemin = "C:\\images\\";

        //Exemple
        //String chemin = "D:\\Zone de Nix\\OneDrive\\Technique\\Workspaces\\JavaEE\\UploadFichiers\\src\\main\\webapp\\images\\";

        /* PrÃ©paration de l'objet formulaire */
        UploadForm form = new UploadForm();

        /* Traitement de la requÃªte et rÃ©cupÃ©ration du bean en rÃ©sultant */
        Fichier fichier = form.enregistrerFichier( request, chemin );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FICHIER, fichier );
        
        //Gestion du nouveau formulaire!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        String titre = request.getParameter("titre");
        int prix = Integer.parseInt(request.getParameter("prix"));
		String categorie = request.getParameter("categorie");
		String description = request.getParameter("description");
//		String nomImage = request.getParameter("nomImage");
		
		
		Annonce annonce = new Annonce(titre,prix,categorie,description/*,nomImage*/);
		
		System.out.println("beanAnnonceCreer");
		
    	Annonce.saveAnnonce(annonce);
    	System.out.println("beanAnnoncesauvegarder");
    	
		HttpSession sessionAnnonce = request.getSession();
		
		
		request.setAttribute("NouvelleAnnonce", annonce);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
