/**
 * 
 */
package org.cuatrovientos.classes;

/**
 * @author Gaizka Gorraiz
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer oneCustomer;
		Customer anotherCustomer;
		
		oneCustomer = new Customer();
		oneCustomer.setName("Gaizka");
		
		oneCustomer.sayHello();
		anotherCustomer = oneCustomer;
		
		anotherCustomer.sayHello();
	}

}
