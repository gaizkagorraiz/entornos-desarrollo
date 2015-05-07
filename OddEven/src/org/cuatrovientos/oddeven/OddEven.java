package org.cuatrovientos.oddeven;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
	int a = 0;
	String line = "";
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Introduce un numero: ");
	line = reader.nextLine();
	a = Integer.parseInt(line);
	
	if (a % 2 == 0) {
		System.out.println("Par");
	} else {
		System.out.println("Impar");
		}
	
		
}
	

}
