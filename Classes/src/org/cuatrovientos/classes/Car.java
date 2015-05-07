package org.cuatrovientos.classes;

public class Car {
	private String model;
	private String plate;
	
	public Car () {
		this.model = "Seat Ibiza";
		this.plate = "2209 GGZ";
	}
	
	// POJO: Plain Old Java Object
	
		public Car(String model, String plate) {
		super();
		this.model = model;
		this.plate = plate;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}
	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}
}
