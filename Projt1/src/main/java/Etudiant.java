/**
 * 
 */

/**
 * 
 */
public class Etudiant {
	private String nom;
	private String prenom;
	private String ville;
	
	
	
	/**
 * @param nom
 * @param prenom
 * @param ville
 */
public Etudiant(String prenom, String nom, String ville) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.ville = ville;
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
	
}
