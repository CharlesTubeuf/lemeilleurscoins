package beans;

import java.util.List;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 // attributs

@Entity
@Table (name = "Compte")
public class Compte {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "id")
private int id;

@Column (name = "pseudo")
private String pseudo;

@Column (name = "mail")
private String mail; 

@Column (name = "mdp")
private String mdp;

@Column (name = "numTel")
private int numTel ;

@Column (name = "ville")
private String ville ;

@Column (name = "codePostal")
private int codePostal;

 // constructeur
public Compte() {	
}

public Compte (String pseudo,String mail, String mdp, int numTel,String ville, int codePostal) {
	this.pseudo=pseudo;
	this.mail=mail;
	this.mdp=mdp;
	this.numTel=numTel;
	this.ville=ville;
	this.codePostal=codePostal;
}

 // METHODES ///////////////////////////////////////////////


public static boolean verifExistant(Compte compte) {
	boolean existe= false;
	
	Configuration config = new Configuration();
	SessionFactory sessionFactory = config.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	List<Compte> result = session.createQuery("from Compte C where C.pseudo ='"+compte.getPseudo()+"'").list();
		if (result.size()  == 0)
		{
			existe=false; 
		}
		else 
		{
			existe = true;
		}				
	session.close();	
	return existe;
}

@Override
public String toString() {
	return "Compte [id=" + id + ", pseudo=" + pseudo + ", mail=" + mail + ", mdp=" + mdp + ", numTel=" + numTel
			+ ", ville=" + ville + ", codePostal=" + codePostal + "]";
}

public static boolean nouveauCompte (Compte leCompte) {
	Configuration config = new Configuration();
	SessionFactory sessionFactory = config.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	
   boolean comptecreer = false;
   
   if( verifExistant(leCompte) == false)
   {
   session.beginTransaction();
   session.save(leCompte);
   session.getTransaction().commit();
   comptecreer = true;
   }
   else {
	   System.out.println("Le pseudo est déja utilisé...");
	   }	   
   session.close();
   return comptecreer;
}

public static boolean connexionCompte(String pseudo, String mdp) {
	
	Configuration config = new Configuration();
	SessionFactory sessionFactory = config.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	boolean connect = false;
	
	List<Compte> result = session.createQuery("from Compte C where C.pseudo ='"+pseudo+"' And C.mdp='"+mdp+"'").list();
	if (result.size()  == 0)
	{ connect = false;}
	else
	{connect = true;}
	session.close();
	return connect;
}

public static Compte getCompte(String pseudo) {
	
	Configuration config = new Configuration();
	SessionFactory sessionFactory = config.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	List<Compte> listCompte = session.createQuery("from Compte C where C.pseudo ='"+pseudo+"'").list();
	Compte compte = listCompte.get(0);
	System.out.println(compte);   // VERIFIE DANS LA CONSOLE QUE LE COMPTE A ETE RECUPERER
	return compte;
}
 // getters et setters 
public int getId() {
	return id;
}

public void setId(int id) {
	this.id=id;
}

public String getPseudo() {
	return pseudo;
}


public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}


public String getMail() {
	return mail;
}


public void setMail(String mail) {
	this.mail = mail;
}


public String getMdp() {
	return mdp;
}


public void setMdp(String mdp) {
	this.mdp = mdp;
}

public int getNumTel() {
	return numTel;
}

public void setNumTel(int numTel) {
	this.numTel = numTel;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public int getCodePostal() {
	return codePostal;
}

public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}



} // fin de la classe compte
