/**
 * 
 */
package info.pello.kitty;

/**
 * Main class of Hello Kitty project
 * @author pello_altadill
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basket myBasket = new Basket();
		Candy someCandy = new Candy("BubbleGum",10.0f, 12);
		Fruit someFruit = new Fruit("Pear",42.5f, "A");
		
		myBasket.insertFood(someCandy);
		myBasket.insertFood(someFruit);
		myBasket.insertFood(new Candy("Jelly",600,1000));
		
		System.out.println("Basket weight: " + myBasket.totalWeight());
		System.out.println("Basket contents:\n " + myBasket.toString());
		
	}

}
