/**
 * 
 */
package info.pello.exercise1poo;

/**
 * Represents a computer
 * @author pello_altadill
 *
 */
public class Computer extends Device {
	private String proccessor;

	
	/**
	 * Constructor
	 * @param name
	 * @param brand
	 * @param price
	 * @param proce
	 */
	public Computer(String name, String brand, String price, String proccessor) {
		super(name, brand, price);
		this.proccessor = proccessor;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [proccessor=" + proccessor + ", name=" + name
				+ ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
