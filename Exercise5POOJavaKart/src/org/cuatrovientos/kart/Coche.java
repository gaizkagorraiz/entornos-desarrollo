/**
 * 
 */
package org.cuatrovientos.kart;

/**
 * @author PC
 *
 */
public class Coche extends Vehiculo {
	
	public String matricula;

	public Coche(String name) {
		super(name);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", toString()=" + super.toString() + "]";
	}
	
	

}
