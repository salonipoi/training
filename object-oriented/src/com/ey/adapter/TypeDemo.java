package com.ey.adapter;

public class TypeDemo implements Theta {
	private String type;

	public TypeDemo(String type) {
		this.type = type;
	}

	@Override
	public String getCarType() {
		return type;
	}

}
