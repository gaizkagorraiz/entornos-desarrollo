/**
 * 
 */
package org.cuatrovientos.operators;

/**
 * @author Gaizka Gorraiz
 *
 */
public class OPERATORS {
	public static void main (String [] args) {
		int a = 0;
		int b = 0;
		int result = 0;
		// Operators ( + - * / %)
		result = a + b;
		System.out.println(result);
		result = a + 42;
		System.out.println(result);
		result = 10 / 2 - b;
		System.out.println(result);
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;		
		System.out.println(result);
		// To negative
		result = -result;
		// Unary operatos
		result = a +1;
		result = a++;
		a = 5;
		a = a + 1;
		System.out.println("a is " + a);
		a++;
		System.out.println("a is " + a);
		a--;
		System.out.println("a is " + a);
		++a;
		System.out.println(result + " " + a);
		a++;
		System.out.println(result + " " + a);
		result = ++a;
		System.out.println(result + " " + a);
		result = a++;
		System.out.println(result + " " + a);
		
		
	}

}
