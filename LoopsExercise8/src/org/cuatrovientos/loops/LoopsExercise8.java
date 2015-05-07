package org.cuatrovientos.loops;


public class LoopsExercise8 {
	public static void main (String args[]) {
		int i = 0;
		int j = 0;
				
		for (j=0; j<11; j++) {
			
				System.out.println("Tabla del " + j);
				for ( i = 0;i<11;i++) {
					System.out.println(j + " x " + i + " = " + (j*i));
				}
			System.out.println("");
		}
	}
}


