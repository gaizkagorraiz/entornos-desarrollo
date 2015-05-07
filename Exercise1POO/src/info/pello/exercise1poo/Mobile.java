/**
 * 
 */
package info.pello.exercise1poo;

/**
 * Represents a mobile phone
 * @author pello_altadill
 *
 */
public class Mobile extends Device {

	private String number;
	
	/**
	 * constructor
	 * @param name
	 * @param brand
	 * @param price
	 * @param number
	 */
	public Mobile(String name, String brand, String price, String number) {
		super(name, brand, price);
		this.number = number;
		
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + "]";
		return "Mobile: " + super.toString();
	}

	/**
	 * method to call
	 * @param numberToCall
	 */
	public void call (int numberToCall) {
		System.out.println("Calling to: " + numberToCall);
	}
	
}
