/**
 * 
 */
package com.projt1;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@RequestScoped
@Named
public class Humain {
	private String nom;
	private String prenom;
	private String ville;
	private List<String> listVille;
	
	private int poids;
	private float prix;
	
	public Humain() {
		listVille = new ArrayList<String>();
		//ajout de quelques villes
		listVille.add("Dakar");
		listVille.add("Thies");
		listVille.add("Fatick");
		listVille.add("Ziguinchor");
	}
	
	public String menu() {
		if(ville.equals("Dakar"))
				 return "dakar";
		if (ville.equals("Fatick"))
			return"fatick";
		if (ville.equals("Thies"))
			return "thies";
		return "zg";
	}
	
	
	
	
	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}



	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}



	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}



	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * @return the listVille
	 */
	public List<String> getListVille() {
		return listVille;
	}
	/**
	 * @param listVille the listVille to set
	 */
	public void setListVille(List<String> listVille) {
		this.listVille = listVille;
	}
	
	
	
}
