/**
 * 
 */
package org.cuatrovientos.opp;

/**
 * Main class for the project
 * @author Gaizka Gorraiz
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person onePerson = new Person ();
		
		onePerson.name = "Adrian";
		onePerson.age = 18;
		
		System.out.println(onePerson.sayHello());
		
		Student oneStudent = new Student();
		oneStudent.name = "Daniel";

	}

}
