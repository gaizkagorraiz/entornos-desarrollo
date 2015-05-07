package org.cuatrovientos.ipaddress;

import java.util.Random;
import java.util.Scanner;

/**
 * IP address generation and management
 * @author PUT_YOUR_NAME
 *
 */
public class Main {
	
	/**
	 * Shows array elements on console
	 * @param ipAddresses
	 */
	public static void showArray(String[] ipAddresses) {
		for (int i = 0; i< ipAddresses.length;i++) {
			System.out.println(i + ":" + ipAddresses[i]);
		}		
	}
	
	/**
	 * Generates random IPs
	 * @return
	 */
	public static String generateRandomIp() {
		Random random = new Random();
		String ip = "";
		
		ip = ip + random.nextInt(256) + ".";
		ip = ip + random.nextInt(256) + ".";
		ip = ip + random.nextInt(256) + ".";
		ip = ip + random.nextInt(256);
		
		return ip;

	}


	/**
	 * Loads an array of Strings with random IPs
	 * @param ipAddresses
	 */
	public static void loadArray(String[] ipAddresses) {
		for (int i = 0; i< ipAddresses.length;i++) {
			ipAddresses[i] = generateRandomIp();
		}
		
	}
	


	/**
	 * Gives a summary of addresses starting with 1, 2 and others
	 * @param ipAddresses
	 */
	public static void summary(String[] ipAddresses) {
		int one = 0;
		int two = 0;
		int other = 0;
		
		
		for (int i = 0; i< ipAddresses.length;i++) {
			
			if (ipAddresses[i].startsWith("1")) {
				one = one + 1;
			} else  {
				if (ipAddresses[i].startsWith("2")) {
					two = two + 1;
				} else {
					other = other + 1;
				}
			}
		}	
		
		System.out.println("1 addresses: " + one);
		System.out.println("2 addresses: " + two);
		System.out.println("Other addresses: " + other);
		
	}

	
	/**
	 * main method
	 * @param args
	 */
	public static void main (String args[]) {
		String [] ipAddresses = new String[10];
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		do {
			System.out.println("1. Display array elements");
			System.out.println("2. Display a randomly generated IP address");
			System.out.println("3. Init array with random IP addresses");
			System.out.println("4. Summary of array");
			System.out.println("5. Exit");
			option = reader.nextLine();
			
			switch (option) {
				case "1":	
					showArray(ipAddresses);
					break;
				case "2":	
					System.out.println(generateRandomIp());
					break;
				case "3":	
					loadArray(ipAddresses);					
					break;
				case "4":	
					summary(ipAddresses);
					break;
				case "5":	
					System.out.println("See you around");
					break;
				default:
					System.out.println("Unknown option");
					}
		} while (!option.equals("5"));
	}


}
