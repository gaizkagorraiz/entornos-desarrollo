package org.cuatrovientos.opp;

public class Person {
	public String name;
	protected int age;
	private String phone;
	
	/**
	 * default constructor
	 */
public Person () {
	name = "Gaizka";
	age = 19;
	phone = "638245572";
}
	/**
	 * say hello
	 * @return hello
	 */
	public String sayHello () {
		return "Hello";
	}	
		/**
		 * returns hello
		 * @return hello
		 */
	private String hello () {
		return "Hello";
}
		
}
