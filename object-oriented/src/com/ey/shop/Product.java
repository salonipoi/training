package com.ey.shop;

/**
 * This Class represents Products of our shopping application
 * 
 * @author Saloni
 * @version 1.0
 * 
 */
public class Product {
	private String name;
	private double price;

	/**
	 * This is a default constructor
	 */

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("Name:" + name + "\t Price:" + price);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public double getPrice() {
		return price;

	}
}