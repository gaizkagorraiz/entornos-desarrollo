/**
 * 
 */
package org.cuatrovientos.generadorip.GeneradorIp;

import java.util.Random;

/**
 * @author PC
 *
 */
public class GeneradorIp {
	
	public int generarNumero (int min, int max) {
		
		Random random = new Random();
		int result;
		result = random.nextInt(max - min +1) + min;
		return result;
		
	}
	public String generarIp() {
	
	int min = 0;
	int max = 255;
	String ip = "";
	ip = generarNumero(min + 1, max - 1) + "." + generarNumero(min + 1, max - 1) + "." + generarNumero(min + 1, max - 1) + "." + generarNumero(min + 1, max - 1);
	return ip;
	}
	
}
