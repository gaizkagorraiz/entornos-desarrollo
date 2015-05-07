/**
 * 
 */
package info.pello.exercise1poo;

/**
 * @author pello_altadill
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Device myDevice = new Device("Display","ACER","129.55");
		
		Mobile myMobile = 
				new Mobile("Galaxy","Samsung","466.6","666444666");

		Computer myComputer =
				new Computer("Vaio","Sony","766.6","Lentium 5");
		

		System.out.println(myMobile.toString());
		System.out.println(myComputer.toString());
		
		
	}

}
