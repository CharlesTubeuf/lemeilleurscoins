package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String chemin = "C:\\Users\\PC 32\\Desktop\\workspace jee\\ProjetFin\\src\\main\\webapp\\images";
        //Exemple
        //String chemin = "D:\\Zone de Nix\\OneDrive\\Technique\\Workspaces\\JavaEE\\UploadFichiers\\src\\main\\webapp\\images\\";

        /* Préparation de l'objet formulaire */
        UploadForm form = new UploadForm();

        /* Traitement de la requête et récupération du bean en résultant */
        Fichier fichier = form.enregistrerFichier( request, chemin );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FICHIER, fichier );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
