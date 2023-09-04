package com.ey.builder;

public class BuilderPatternPC {

	public static void main(String[] args) {

		PC computer1 = new PC.ComputerBuilder("Intel i9", 32, 2000).ssd(500).gpu("NVIDIA GeForce RTX 3090").build();

		PC computer2 = new PC.ComputerBuilder("AMD Ryzen 7", 16, 1000).gpu("AMD Radeon RX 6800").build();

		// Print Computer details

		System.out.println("Computer 1:");

		System.out.println(computer1.toString());

		System.out.println("\nComputer 2:");

		System.out.println(computer2.toString());

	}

}