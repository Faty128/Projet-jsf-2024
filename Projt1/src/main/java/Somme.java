/**
 * 
 */

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@RequestScoped
@Named
public class Somme {
	private int a;
	private int b;
	private int resultat;
	
	
	public String addition() {
		resultat = a + b;
		if (resultat % 2 == 0) {
			return "sipaire"; 
		}
		return "siimpaire";
	}
	
	/**
	 * @return the resultat
	 */
	public int getResultat() {
		return resultat;
	}
	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
}
