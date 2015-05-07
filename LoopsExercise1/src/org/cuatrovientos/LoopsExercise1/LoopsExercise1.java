package org.cuatrovientos.LoopsExercise1;

import java.util.Scanner;

public class LoopsExercise1 {
	public static void main(String[] arg)  {
		int number = 0;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter a number;");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		while (number > 0) {
			System.out.println("Hello");
			number = number - 1;
		}
		System.out.println("ERROR");
}
}