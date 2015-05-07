/**
 * 
 */
package org.cuatrovientos.coin;

import java.util.Random;

/**
 * @author PC
 *
 */
public class Coin {
	
	/**
	 * default constructor (por defecto, no hace falta ponerlo)
	 */
	public Coin () {
		System.out.println("New instance of Coin");
	}
	
	/**
	 * flips a coin
	 */
	public void flip () {
		Random random = new Random();
		int result = 0;
		
		result = random.nextInt(2);
		
		if (result == 0) {
			System.out.println("HEADS");
		} else {
			System.out.println("TAILS");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coin mySuperCoin = new Coin();
		
		mySuperCoin.flip();

	}

}
