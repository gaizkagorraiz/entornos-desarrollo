/**
 * 
 */
package org.cuatrovientos.kart;



import java.util.Vector;

/**
 * @author PC
 *
 */
public class Carrera {
	
	private String name;
	private Circuito circuito;
	private Vector<Vehiculo> participantes;
	private Vector<Integer> positions;
	
	public Carrera (String name, Circuito circuito) {
		this.name = name;
		this.circuito = circuito;
		participantes = new Vector<Vehiculo>();
		positions = new Vector<Integer>();
	}
	
	public void addVehiculo (Vehiculo vehiculo) {
		participantes.add(vehiculo);
		positions.add(new Integer(0));	
	}
	
	public Vehiculo carrera () {
		Vehiculo winner = null;
		
		for (int i = 0; i < participantes.size();i++) {
			int movement = participantes.elementAt(i).move();
			int current = positions.elementAt(i);
			int newPosition = movement + current;
			
			positions.setElementAt(newPosition,  i);
			if (newPosition >= circuito.getPosition()) {
				winner = participantes.elementAt(i);
				break;
			}
		}
		return winner;
	}
}
