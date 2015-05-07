package org.cuatrovientos.opp;

/**
 * Represents a student
 * @author Gaizka Gorraiz
 *
 */

public class Student extends Person {
	private String school;
	
	public Student () {
		school = "Cuatrovientos";
	}
	
	
	public void learn () {
		System.out.println ("I'm learning");
	}

}
