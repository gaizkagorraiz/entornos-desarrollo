/**
 * 
 */
package org.cuatrovientos.conversor;

/**
 * @author PC
 *
 */
public class Conversor {
	private double cantidad;
	
	public double pesetasAEuros(double cantidad) {
	double result;
	result = cantidad / 166.386d;
	return result;
	}	
	public static void main (String[] args) {
		Conversor mySuperConversor = new Conversor();
		
		//Convert pesetas to euros
		double result = mySuperConversor.pesetasAEuros(1000);
		System.out.println("Total euros: " + result + "€");
	}
	
	public double eurosAPesetas(double cantidad) {
		double result;
		result = cantidad * 166;
		return result;
	}
	
	public double eurosADolares(double cantidad) {
		double result;
		result = cantidad * 1.24;
		return result;
	}
	public double dolaresAEuros(double cantidad){
		double result;
		result = cantidad * 0.8;
		return result;
	}
	
	public double eurosaLibras(double cantidad){
		double result;
		result = cantidad * 0.79;
		return result;
	}
	
	public double librasAEuros(double cantidad){
		double result;
	result = cantidad * 166;
	return result;
	}

	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	


}
