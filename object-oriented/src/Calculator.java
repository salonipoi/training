
public class Calculator {
	private double total;

	public Calculator(double total) {
		this.total = total;

	}

	public void add(double num) {
		total += num;
	}

	public void sub(double num) {
		total -= num;

	}

	public void multiply(double num) {
		total *= num;

	}

	public void divide(double num) {
		total /= num;
	}

	public void result() {

		System.out.println("No: " + total);
	}

}