/**
 * 
 */
package com.projt1;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 */
@RequestScoped
@Named
public class Test {
	private String testString;
	private Integer number;
	
	
	/**
	 * le constructeur par défaut sans arguments
	 */
	public Test() {
		testString = "1234567890";
		number = 12345;
				
	}
	/**
	 * @return the testString
	 */
	public String getTestString() {
		return testString;
	}
	/**
	 * @param testString the testString to set
	 */
	public void setTestString(String testString) {
		this.testString = testString;
	}
	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
