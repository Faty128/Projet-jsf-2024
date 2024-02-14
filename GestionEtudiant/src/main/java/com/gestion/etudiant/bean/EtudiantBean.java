/**
 * 
 */
package com.gestion.etudiant.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@RequestScoped
@Named
public class EtudiantBean {
	private Etudiant etudiant;
	private List<Etudiant> listeEtudiant;
	
public EtudiantBean() {
	etudiant = new Etudiant();
		listeEtudiant = new ArrayList<Etudiant>();
	
		addEtudiant(new Etudiant ("Ndiaye", "Fatou", new Date()));
		addEtudiant(new Etudiant ("Faye", "Moussa", new Date()));
		addEtudiant(new Etudiant ("Sy", "Ousmane", new Date()));
}	

public void addEtudiant(Etudiant e) {
	listeEtudiant.add(e);
}

	/**
	 * @return the etudiant
	 */
	public Etudiant getEtudiant() {
		return etudiant;
	}
	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	/**
	 * @return the listeEtudiant
	 */
	public List<Etudiant> getListeEtudiant() {
		return listeEtudiant;
	}
	/**
	 * @param listeEtudiant the listeEtudiant to set
	 */
	public void setListeEtudiant(List<Etudiant> listeEtudiant) {
		this.listeEtudiant = listeEtudiant;
	}
	
	
}
