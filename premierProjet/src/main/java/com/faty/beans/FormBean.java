/**
 * 
 */
package com.faty.beans;

import javax.faces.bean.ManagedBean;

import javax.faces.event.NamedEvent;
//import javax.entreprise.context.RequestScoped;
/**
 * 
 */
@javax.faces.bean.RequestScoped
@NamedEvent
public class FormBean {
	private String username;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}


}
