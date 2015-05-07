/**
 * 
 */
package org.cuatrovientos.kart;

/**
 * @author PC
 *
 */
public class Circuito {
	private String name;
	private int position;
	
	public Circuito(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circuito [name=" + name + ", position=" + position + "]";
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
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	

}
