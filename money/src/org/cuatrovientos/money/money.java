package org.cuatrovientos.money;

import java.util.Scanner;

public class money {
	public static void main(String [] args) {
		float amount = 0;
		float result = 0;
		String currency = "";
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter a number;");
		line = reader.nextLine();
		amount = Float.parseFloat(line);
		
		System.out.println("Enter a currency:");
		currency = reader.nextLine();
		
		switch (currency) {
		case "d":
			result = amount * 1.27f;
			break;
		case "y":
			result = amount * 135.89f;
			break;
		case "l":
			result = amount * 0.79f;
			break;
		default:
			System.out.println("Currency not support");
			break;
		}
	}
}