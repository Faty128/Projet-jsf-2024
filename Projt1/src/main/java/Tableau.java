/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@RequestScoped
@Named
public class Tableau {
	private List<String> listeVille;
	private List<Etudiant> listeEtudiant;
	
	
	
	public Tableau() {
		addVille();
		listeEtudiant = new ArrayList<Etudiant>();
		listeEtudiant.add(new Etudiant("Faty", "Niang", "Louga"));
		listeEtudiant.add(new Etudiant("Aminata", "Diange", "Thies"));
		listeEtudiant.add(new Etudiant("Nafisatou", "Diop", "Fouta"));
		listeEtudiant.add(new Etudiant("Khadija", "Diop", "Diourbel"));
		listeEtudiant.add(new Etudiant("Ndoumbé", "Yade", "Dakar"));
		listeEtudiant.add(new Etudiant("Lamine", "Cissé", "Ziguinchor"));
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


	public void addVille() {
		listeVille = new ArrayList<String>();
		
		listeVille.add("Dakar");
		listeVille.add("Thies");
		listeVille.add("Ziguinchor");
		listeVille.add("Fatick");
		listeVille.add("Kaolack");
		listeVille.add("Mbour");
		listeVille.add("Saint-Louis");
		listeVille.add("Louga");
		listeVille.add("Kolda");
		
	}

	/**
	 * @return the listeVille
	 */
	public List getListeVille() {
		return listeVille;
	}

	/**
	 * @param listeVille the listeVille to set
	 */
	public void setListeVille(List listeVille) {
		this.listeVille = listeVille;
	}
	
	
}
