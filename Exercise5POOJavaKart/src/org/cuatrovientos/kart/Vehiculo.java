package org.cuatrovientos.kart;

import java.util.Random;

public class Vehiculo {
	protected String name;
	protected int speed;
	protected int aceleration;
	protected int grip;
	
	public Vehiculo(String name) {
		super();
		this.name = name;
		ini ();
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
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the aceleration
	 */
	public int getAceleration() {
		return aceleration;
	}

	/**
	 * @param aceleration the aceleration to set
	 */
	public void setAceleration(int aceleration) {
		this.aceleration = aceleration;
	}

	/**
	 * @return the grip
	 */
	public int getGrip() {
		return grip;
	}

	/**
	 * @param grip the grip to set
	 */
	public void setGrip(int grip) {
		this.grip = grip;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [name=" + name + ", speed=" + speed + ", aceleration=" + aceleration + ", grip=" + grip + "]";
	}
	
	private void ini () {
		speed = 6;
		aceleration = 6;
		grip = 6;
	}
	
	public int move() {
		int points = 0;
		Random random = new Random();
		
		points = speed + aceleration + random.nextInt(6);
		
		return points;
	}
	
	public int maneuvre() {
		int points = 0;
		Random random = new Random();
		
		points = grip + random.nextInt(6);
		
		return points;
	}
}
