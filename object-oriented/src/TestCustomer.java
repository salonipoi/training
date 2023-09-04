import com.ey.shop.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("Polo", 4000);
		c1.details();
		System.out.println("Salary :" + c1.getCreditLimit());
	}
}
