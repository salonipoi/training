package inventory;

public class Product {
	private int code;
	private String name;
	private double price;

	public Product() {
	}

	public Product(int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", toString()=" + super.toString()
				+ "]";
	}

}
