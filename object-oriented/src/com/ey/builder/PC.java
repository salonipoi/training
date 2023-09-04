package com.ey.builder;

public class PC {

	private String cpu;

	private int ram;

	private int hdd;

	private int ssd;

	private String gpu;

	private PC(ComputerBuilder builder) {

		this.cpu = builder.cpu;

		this.ram = builder.ram;

		this.hdd = builder.hdd;

		this.ssd = builder.ssd;

		this.gpu = builder.gpu;

	}

	public static class ComputerBuilder {

		private String cpu;

		private int ram;

		private int hdd;

		private int ssd;

		private String gpu;

		public ComputerBuilder(String cpu, int ram, int hdd) {

			this.cpu = cpu;

			this.ram = ram;

			this.hdd = hdd;

		}

		public ComputerBuilder ssd(int ssd) {

			this.ssd = ssd;

			return this;

		}

		public ComputerBuilder gpu(String gpu) {

			this.gpu = gpu;

			return this;

		}

		public PC build() {

			return new PC(this);

		}

	}

	// Getters for Computer attributes

	public String getCpu() {

		return cpu;

	}

	public int getRam() {

		return ram;

	}

	public int getHdd() {

		return hdd;

	}

	public int getSsd() {

		return ssd;

	}

	public String getGpu() {

		return gpu;

	}

	@Override

	public String toString() {

		// TODO Auto-generated method stub

		return "Computer [" + "CPU: " + cpu + " RAM: " + ram + " HDD:" + hdd + " SSD: " + ssd + " GPU: " + gpu + "]";

	}
	

}