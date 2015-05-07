package org.cuatrovientos.loops;

import java.util.Scanner;

public class LoopsExercise6 {
	public static void main(String[] arg)  {
		int number = 0;
		int factorial = 0;
		
		String line = "";
		Scanner reader = new Scanner(System.in);
				
		System.out.println("Enter a number;");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		factorial = number;
		number = number - 1;
		
		while (number > 1){
			System.out.println(factorial + " " );
			factorial = factorial * number;
			number = number - 1;
		}
		
		
		

}
}