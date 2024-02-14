/**
 * 
 */
package com.projt1;


import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Personn {
	private int id;
	private String nom;
	private String prenom;
	private String Ville;
	private String pays;
	private List<String> listePays;
	private String password;
	private String adresse;
	
	/**
	 * le constructeur sans argument
	 */
	public Personn() {
		this.listePays = new ArrayList<String>();
		//ajout de quelques pays dans la liste
		this.listePays.add("Sénégal");
		this.listePays.add("Gambi");
		this.listePays.add("Guiné Bisau");
		this.listePays.add("Mali");
		this.listePays.add("Angleterre");
	}
	
	
	
	 
	
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}





	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}





	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}


	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}


	/**
	 * @return the listePays
	 */
	public List<String> getListePays() {
		return listePays;
	}



	/**
	 * @param listePays the listePays to set
	 */
	public void setListePays(List<String> listePays) {
		this.listePays = listePays;
	}

	
	/**
	 * @return the ville
	 */
	public String getVille() {
		return Ville;
	}

	
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		Ville = ville;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
