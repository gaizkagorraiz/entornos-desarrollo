/**
 * 
 */
package org.cuatrovientos.userlist;

/**
 * @author PC
 *
 */
public class User {
	
	public String name;
	public String surname;
	
	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + "]";
	}
	
	

}
