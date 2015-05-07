/**
 * 
 */
package info.pello.kitty;

/**
 * Represents Hello Kitty's food
 * @author pello_altadill
 *
 */
public class Food {
	
	protected String name;
	protected float weight;
	
	/**
	 * Constructor with params
	 * @param name
	 * @param weight
	 */
	public Food(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Food [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
}
