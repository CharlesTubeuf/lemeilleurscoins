package beans;

 // attributs
public class Compte {
	
private String pseudo;
private String mail; 
private String mdp;

 // constructeur
public Compte() {	
}

public Compte (String pseudo,String mail, String mdp) {
	this.pseudo=pseudo;
	this.mail=mail;
	this.mdp=mdp;
}

 // méthode
@Override
public String toString() {
	return "Compte [pseudo=" + pseudo + ", mail=" + mail + ", mdp=" + mdp + "]";
}

 // getters et setters 
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
