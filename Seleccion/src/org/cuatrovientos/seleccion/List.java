/**
 * 
 */
package org.cuatrovientos.seleccion;


import java.util.Vector;

/**
 * @author PC
 *
 */
public class List {

	/**
	 * crear el vector
	 */
	private Vector<Player> players;

	/**
	 * @return the players
	 */
	public Vector<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Vector<Player> players) {
		this.players = players;
	}

	/**
	 * iniciar el vector
	 */
	public List() {
		players = new Vector<Player>();
	}

	/**
	 * meter elementos al vector
	 * @param food
	 */
	public void addPLayer (Player player)  {
		players.add(player);
	}
	
	public void removePlayer (Player player){
		
		players.remove(player.name);
		
	}
	
	public String showPlayersByPosition(){
		String result = "";
		for (Player player: players) {
			result = result + player.toString() + "\n";
		}
		return result;
	}
	
	public String readAll() {
		String result = "";
		for (Player player: players) {
		result = result + player.toString() + "\n";
		}
		return result;
		}
}


