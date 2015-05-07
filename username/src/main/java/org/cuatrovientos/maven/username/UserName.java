/**
 * 
 */
package org.cuatrovientos.maven.username;

/**
 * @author PC
 *
 */
public class UserName {
	
	public String name;
	public String surname;

	public UserName(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public UserName() {
			
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

	
}
