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
@Table(name = "villes_france_free")

public class VilleFrance {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ville_id;
	private String ville_nom;
	private String ville_code_postal;
	private float ville_longitude_deg;
	private float ville_latitude_deg;
	
	
	public VilleFrance(int ville_id, String ville_nom, String ville_code_postal, float ville_longitude_deg,
			float ville_latitude_deg) {
		super();
		this.ville_id = ville_id;
		this.ville_nom = ville_nom;
		this.ville_code_postal = ville_code_postal;
		this.ville_longitude_deg = ville_longitude_deg;
		this.ville_latitude_deg = ville_latitude_deg;
	}

	public VilleFrance() {
		
	}

	public int getVille_id() {
		return ville_id;
	}


	public void setVille_id(int ville_id) {
		this.ville_id = ville_id;
	}


	public String getVille_nom() {
		return ville_nom;
	}


	public void setVille_nom(String ville_nom) {
		this.ville_nom = ville_nom;
	}


	public String getVille_code_postal() {
		return ville_code_postal;
	}


	public void setVille_code_postal(String ville_code_postal) {
		this.ville_code_postal = ville_code_postal;
	}


	public float getVille_longitude_deg() {
		return ville_longitude_deg;
	}


	public void setVille_longitude_deg(float ville_longitude_deg) {
		this.ville_longitude_deg = ville_longitude_deg;
	}


	public float getVille_latitude_deg() {
		return ville_latitude_deg;
	}


	public void setVille_latitude_deg(float ville_latitude_deg) {
		this.ville_latitude_deg = ville_latitude_deg;
	}

	@Override
	public String toString() {
		return "VilleFrance [ville_id=" + ville_id + ", ville_nom=" + ville_nom + ", ville_code_postal="
				+ ville_code_postal + ", ville_longitude_deg=" + ville_longitude_deg + ", ville_latitude_deg="
				+ ville_latitude_deg + "]";
	}
	
	
	

}
