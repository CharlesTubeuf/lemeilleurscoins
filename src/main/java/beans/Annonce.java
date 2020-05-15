package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Entity
@Table (name = "Annonce")
public class Annonce {

	// ATTRIBUTS
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	private int prix;
	private String categorie;
	private String description;
//	private String nomImage; //généré un nom automatique sans doublons
	
	// constructeurs
	public Annonce() {	
	}

	public Annonce (String titre,int prix , String categorie, String description/*,String nomImage*/) {
		 this.titre=titre;
		 this.prix=prix;
		 this.categorie=categorie; 
		 this.description=description;
//		 this.nomImage=nomImage;
	}
	
	// Méthodes
	
	public static void saveAnnonce (Annonce annonce) {
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	   session.beginTransaction();
	   session.save(annonce);
	   session.getTransaction().commit();	      
	   session.close();
	 
	}
	
	

	
	// Getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public String getNomImage() {
//		return nomImage;
//	}
//
//	public void setNomImage(String nomImage) {
//		this.nomImage = nomImage;
//	}
	
	
	
	
}// FIN DE LA CLASS ANNONCES
