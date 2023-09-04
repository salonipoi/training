package com.ey.adapter;

public class SportsCar implements Turbo {
	private String model;
	private double topSpeed;

	public SportsCar(String model, double topSpeed) {
		// super();
		this.model = model;
		this.topSpeed = topSpeed;
	}

	@Override
	public double getSpeed() {
		return topSpeed;
	}

	@Override
	public String toString() {
		return "SportsCar [Model=" + model + ", topSpeed=" + topSpeed + "]";
	}

}
