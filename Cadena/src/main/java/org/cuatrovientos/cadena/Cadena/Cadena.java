/**
 * 
 */
package org.cuatrovientos.cadena.Cadena;

/**
 * @author PC
 *
 */
public class Cadena {

	public int longitud (String cadena) {
		return cadena.length();
	}
	
	public int vocales (String cadena) {
		int vocales = 0;
		for (int i = 0; i < cadena.length(); i++){
			if (cadena.charAt(i) == 'a' ||
				cadena.charAt(i) == 'e' ||
				cadena.charAt(i) == 'i' ||
				cadena.charAt(i) == 'o' ||
				cadena.charAt(i) == 'u'){
				vocales++;
			}
		}
		return vocales;
	}
	
	public String invertir (String cadena) {
		String invertir = "";
		for (int i = cadena.length() -1; i>=0; i--) {
			invertir = invertir + cadena.charAt(i);
		}
		return invertir;
	}
	
	public int contarLetra (String cadena, char caracter) {
		int total = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				total++;
			}
		}
		return total;
	}

	

}
