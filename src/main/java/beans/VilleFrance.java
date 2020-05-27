package beans;

import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.*;


@Entity
@Table(name = "villes_france_free_test")

public class VilleFrance {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ville_id")
	private int ville_id;
	@Column (name = "ville_nom")
	private String ville_nom;
	@Column (name = "ville_code_postal")
	private String ville_code_postal;
	@Column (name = "ville_longitude_deg")
	@NotNull
	private float ville_longitude_deg;
	@Column (name = "ville_latitude_deg")
	@NotNull
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
