/**
 * 
 */
package com.gestionetudiant.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@Named
@RequestScoped
public class EtudiantBean {
	private Etudiant etudiant;
	private List<Etudiant> listeEtudiant;
	
	/**
	 * le constructeur sans arguments
	 */
	public EtudiantBean() {
		//on va instancier notre classe etudiant
		etudiant = new Etudiant();
	}
	/**
	 * une méthode pour supprimer un etudiant
	 * @param id
	 */
	public String deleteEtudiant(int id) {
		System.out.println("suppresion de l'etudiant: "+id);
	
		//on choisi le driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//on se connecte à la bd
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant", "root", "");
			
			//on ecrit la requet
			String req = "delete from etudiant where id = ?";
			//preparation de la requete
			PreparedStatement ps = con.prepareStatement(req);
			//on va mettre la valeur paramétre
			ps.setInt(1, id);
			
			//execution de la requete
			ps.execute();
			
			return "";
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			return "";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "";
		}
	}
	
	
	public void updateEtudiant(int id) {
		System.out.println("mise à jour de l'etudiant: "+id);
	}
	/**
	 * la méthode qui permet d'ajouter un étudiant
	 * @param e
	 * @return
	 */
	public String addEtudiant(Etudiant e) {
		
		try {
			//on choisi notr driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//connection à la base de données
	       
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant", "root", "");
				//definir la requete
				String req = "insert into etudiant (nom,prenom,ville) value(?,?,?)";
				//preparation de la requete
				PreparedStatement ps = con.prepareStatement(req);
				//on va renseigner nos parametre de la requete
				ps.setString(1, e.getNom());
				ps.setString(2, e.getPrenom());
				ps.setString(3, e.getVille());
				
				//on execute la requete
				ps.execute();
				
				etudiant = new Etudiant();
				
				return "liste";
				
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "";
		}
	}
	/**
	 * la méthode qui permet de récupérer laa liste des étudiants
	 */
	public void chargerListeEtudiant() {
	    listeEtudiant = new ArrayList<Etudiant>();

	    try {
	        // Charger le driver MySQL
	        Class.forName("com.mysql.jdbc.Driver");

	        // Se connecter à la base de données
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiant", "root", "");

	        // Préparer la requête
	        PreparedStatement ps = con.prepareStatement("select * from etudiante");

	        // Exécuter la requête
	        ResultSet rs = ps.executeQuery();

	        // Récupérer les résultats et les stocker dans listeEtudiant
	        while (rs.next()) {
	            // Créer une instance d'Etudiant
	            Etudiant e = new Etudiant();
	            e.setId(rs.getInt("id"));
	            e.setNom(rs.getString("nom"));
	            e.setPrenom(rs.getString("prenom"));
	            e.setVille(rs.getString("ville"));

	            // Ajouter l'Etudiant à la listeEtudiant (ArrayList)
	            listeEtudiant.add(e);
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }
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
