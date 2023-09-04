import com.ey.shop.Product;

public class ProductReflection {

	public static void main(String[] args) {

		Product p1 = new Product("Parker", 120);
		p1.print();
		System.out.println(p1);
	}

}
