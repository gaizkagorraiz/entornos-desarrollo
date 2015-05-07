/**
 * 
 */
package info.pello.kitty;

/**
 * Represents fruits , extends Food class
 * @author pello_altadill
 *
 */
public class Fruit extends Food {

	private String vitamin;
	
	/**
	 * Constructor from superclass
	 * @param name
	 * @param weight
	 * @param vitamin
	 */
	public Fruit(String name, float weight, String vitamin) {
		super(name, weight);
		this.vitamin = vitamin;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruit [vitamin=" + vitamin + ", name=" + name + ", weight="
				+ weight + "]";
	}
	
	

}
