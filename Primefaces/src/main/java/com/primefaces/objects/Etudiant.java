/**
 * 
 */
package com.primefaces.objects;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Etudiant {
	private String matricule;
	private String nom;
	private String prenom;
	private Date dateNais;
	private String motivation;
	private List<String> images;
	private String couleur;
	
	
	
	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Etudiant() {
		images = new ArrayList<String>();
		
		images.add("Moitié De Pain.jpg");
		images.add("Pain Au Chocolat.jpg");
		images.add("Paris.jpg");
		images.add("Moitié De Pain.jpg");
	}
	
	/**
	 * @return the images
	 */
	public List<String> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<String> images) {
		this.images = images;
	}

	/**
	 * @return the motivation
	 */
	public String getMotivation() {
		return motivation;
	}

	/**
	 * @param motivation the motivation to set
	 */
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateNais
	 */
	public Etudiant(String matricule, String nom, String prenom, Date dateNais) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	 * @return the dateNais
	 */
	public Date getDateNais() {
		return dateNais;
	}
	/**
	 * @param dateNais the dateNais to set
	 */
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	
	
}
