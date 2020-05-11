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

 // constructeur
public Compte() {	
}

public Compte (String pseudo,String mail, String mdp) {
	this.pseudo=pseudo;
	this.mail=mail;
	this.mdp=mdp;
}

 // METHODES ///////////////////////////////////////////////
@Override
public String toString() {
	return "Compte [pseudo=" + pseudo + ", mail=" + mail + ", mdp=" + mdp + "]";
}

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



} // fin de la classe compte
