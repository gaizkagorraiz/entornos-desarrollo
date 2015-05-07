/**
 * 
 */
package info.pello.kitty;

/**
 * @author pello_altadill
 *
 */
public class Candy extends Food {
	
	private int calories; 
	
	/**
	 * @param name
	 * @param weight
	 */
	public Candy(String name, float weight, int calories) {
		super(name, weight);
		this.calories = calories;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candy [calories=" + calories + super.toString() +"]";
	}
	
	

}
