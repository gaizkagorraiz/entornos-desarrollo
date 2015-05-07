/**
 * 
 */
package org.cuatrovientos.classhello;

/**
 * @author PC
 *
 */
public class Hello {
	
	private String greet = "Hello!!!";
	/**
	 * say hello on console
	 */
	public void sayHello () {
		System.out.println(greet);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Hello myHello = new Hello();
	myHello.sayHello();

	}

}
