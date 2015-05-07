
package org.cuatrovientos.methods;

import java.util.Random;

/**
 * @author Gaizka Gorraiz
 *
 */
public class NumbersArray {

	/**
	 * show all elements of an array
	 */
	public static void showAll (int [] myArray) {
		System.out.println("Array content: ");
		for (int i = 0; i< myArray.length;i++) {
			System.out.println(i + ": " + myArray[i]);
		}
	}
	
	/**
	 * inits array elements with given number
	 * @param myArray
	 * @param number
	 */
	public static void initWithNumber (int[] myArray, int number) {
		for (int i = 0; i< myArray.length;i++) {
			myArray[i] = number;
		}
		number = 333;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numbers = new int[15];
		Random random = new Random();
		
		int aNumber = random.nextInt(10);
		
		showAll(numbers);
		initWithNumber(numbers, aNumber);
		showAll(numbers);
		System.out.println("Has aNumber changed? " + aNumber);
		
		
		
	}

}
