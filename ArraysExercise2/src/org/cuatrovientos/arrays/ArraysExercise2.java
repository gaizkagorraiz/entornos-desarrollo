package org.cuatrovientos.arrays;
import java.util.Scanner;

public class ArraysExercise2 {

	public static void main(String[] args) {
		
			String names[]={"","","","","","","","","",""};
			String line= "";
			Scanner reader = new Scanner(System.in);
				
				System.out.println("Vamos a rellenar el array");
				
			
				for (int i=0; i<names.length; i++){
					System.out.println("Posición " + i  +". Introduce un elemento");
					line = reader.nextLine();
					names[i]=line;			
				}	
						
				for (int i=0; i<names.length; i++) {
					System.out.println("En la posición "+ i + " esta: " + names[i]);
				}
				
			}

		}
