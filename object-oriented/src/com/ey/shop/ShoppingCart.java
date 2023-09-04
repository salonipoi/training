package com.ey.shop;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> products;
	private double total;
	private int index;

	public ShoppingCart() {
		products = new ArrayList<Product>();
	}

	// public void addToCart(Product p) throws ShopException {
//		if (index == products.length) {
//			throw new ShopException("Cart is Full!!!");}
//		else {
//			products[index] = p;
//			index++;
	public void addToCart(Product p) {
		products.add(p);
		total += p.getPrice();

	}

	public void checkout() {
		System.out.println("Your order summary...");
//		for (int i = 0; i < index; i++)
//			products[i].print();
		products.forEach(System.out::println);

		System.out.println("Total amount :" + total);
	}
}
