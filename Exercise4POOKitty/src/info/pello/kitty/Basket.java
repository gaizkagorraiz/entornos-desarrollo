/**
 * 
 */
package info.pello.kitty;

import java.util.Vector;

/**
 * Represents a basket full or not of food
 * @author pello_altadill
 *
 */
public class Basket {
	
	/**
	 * crear el vector
	 */
	private Vector<Food> foods;

	/**
	 * iniciar el vector
	 */
	public Basket() {
		foods = new Vector<Food>();
	}

	/**
	 * meter elementos al vector
	 * @param food
	 */
	public void insertFood (Food food)  {
		foods.add(food);
	}
	
	/**
	 * gives total weight of content
	 * @return peso total de la comida
	 */
	public float totalWeight() {
		float total = 0;
		
		for (int i = 0; i < foods.size();i++) {
			total = total + foods.elementAt(i).getWeight();
		}
		
		return total;
	}
	
	
	/**
	 * returns a String with food data
	 * @return food data
	 */
	public String toString () {
		String result = "";
		
		// for each
		for (Food food : foods) {
			result = result + food.toString();
		}
		
		return result;
	}
	
}
