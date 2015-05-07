/**
 * 
 */
package org.cuatrovientos.seleccion;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new List();
		String name = "";
		int dorsal = 0;
		String position = "";
		Player player = null;
		
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		
		
		do {
			System.out.println("-----MyList-----");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new player");
			System.out.println("2. Remove player");
			System.out.println("3. Show players by position");
			System.out.println("4. Show all players");
			System.out.println("5. Exit");
			
			option = reader.nextLine();
			
			switch (option) {
			case "1":
				System.out.println("Please, enter text");
				name = reader.nextLine();
				dorsal = Integer.parseInt(reader.nextLine());
				position = reader.nextLine();
				list = new List();
				player = new Player(name,dorsal,position);
				list.addPLayer(player);
				break;
				
			case "2":
				System.out.println("Please enter a name");
				name = reader.nextLine();
				list.removePlayer(player);
				break;
				
			case "3": 
				System.out.println("Please enter a position");
				position = reader.nextLine();
				for (int i = 0; i < list.getPlayers().size(); i++) {
					if (list.getPlayers().get(i).position.equals(position)) {
						System.out.println(list.getPlayers().get(i).name);
					}
				}
				break;
				
			case "4":
				System.out.println(list.readAll());
				break;
				
			case "5":
				System.out.println();
				System.out.println("Bye");
			
			default:
				System.out.println();
				System.out.println("TRY AGAIN");
				break;
					
			}
		
		} while (!option.equals("5"));
	}

}
