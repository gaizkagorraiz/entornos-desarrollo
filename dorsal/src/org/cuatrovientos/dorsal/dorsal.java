package org.cuatrovientos.dorsal;

import java.util.Scanner;

public class dorsal {
	public static void main(String [] args) {
		int dorsal = 0;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter a number;");
		
		line = reader.nextLine();
		
		dorsal = Integer.parseInt(line);
		
		if(dorsal>0 && dorsal <=99);
		
		switch (dorsal) {
		
		case 1:
			System.out.println("Goalkeeper");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("Defense");
			break;
			
		case 6:
		case 8:
		case 11:
			System.out.println("Midfielder");
			break;
			
		case 9:
			System.out.println("Striker");
			break;
			
		default:
			System.out.println("Versatile");
			
		}
	}
}
