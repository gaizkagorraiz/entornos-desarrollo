package org.cuatrovientos.userinput;

import java.util.Scanner;

public class UserInput {
	public static void main  (String []args) {
		int a = 0;
		int b = 0;
		int result = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//ask a number
		System.out.println("Enter a number;");
		// read from console
		line = reader.nextLine();
		System.out.println("You entered: " + line);
		// converts line to int
		a = Integer.parseInt(line);
		
		System.out.println("Enter a number");
		line = reader.nextLine();
		b = Integer.parseInt(line);
		
		
	}

}
