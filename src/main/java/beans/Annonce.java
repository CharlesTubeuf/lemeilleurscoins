package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private List<String> nomImage; //généré un nom automatique sans doublon
	
	// constructeurs
	
	// Méthodes
	
	// Getters and setters
	
	
}// FIN DE LA CLASS ANNONCES
