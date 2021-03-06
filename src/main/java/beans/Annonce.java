package beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
	private String nomImage; 
	
	@ManyToOne
	@JoinColumn (name ="compte_id")
	private Compte compte;
	
	// constructeurs
	
	
	public Annonce() {	
	}

	public Annonce (String titre,int prix , String categorie, String description,String nomImage  ,Compte compte  ) {
		 this.titre=titre;
		 this.prix=prix;
		 this.categorie=categorie; 
		 this.description=description;
		 this.nomImage=nomImage;
		 this.compte=compte;
		 
	}
	
	// METHODES
	

	public static void saveAnnonce (Annonce annonce) {
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session sessionSaveAnnonce = sessionFactory.openSession();
		
		sessionSaveAnnonce.beginTransaction();
		sessionSaveAnnonce.save(annonce);
		sessionSaveAnnonce.getTransaction().commit();	      
		sessionSaveAnnonce.close();
	 
	}
	
	public static List<Annonce> getListAnnonceByCompteId (int compteId) {
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		VA CHERCHER les annonces du
		Query query = session.createQuery("FROM Annonce A WHERE A.compte.id =:cmpt");
		query.setParameter("cmpt", compteId);
		
		List<Annonce> listAnnonces = query.list();
		
		session.getTransaction().commit();	      
		session.close();
		return listAnnonces;
	}
	
	@Override
	public String toString() {
		return "Annonce [id=" + id + ", titre=" + titre + ", prix=" + prix + ", categorie=" + categorie
				+ ", description=" + description + ", nomImage=" + nomImage + ", compte=" + compte
				+ "]";
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

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public String getNomImage() {
		return nomImage;
	}

	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}

	
	
	
	
}// FIN DE LA CLASS ANNONCES
