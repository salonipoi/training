import java.util.ArrayList;

import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;
import com.ey.shop.Product;
import com.ey.shop.ShopException;
import com.ey.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) throws ShopException {
		ShoppingCart cart = new ShoppingCart();
		ArrayList<Product> p1 = new ArrayList<Product>();
		
		

		cart.addToCart(new Product("1AirPods", 8999));
		cart.addToCart(new Product("2Apple Watch SE", 33000));
		cart.addToCart(new Product("3AirPods max", 8999));
		cart.addToCart(new Product("4Apple Watch SE max", 33000));
		cart.addToCart(new Product("5AirPods pro max", 8999));
		cart.addToCart(new Product("6Apple Watch SE pro max", 33000));

		
		cart.checkout();
//		cart.addToCart(p1);
//		try {
//			cart.addToCart(new Product("7Apple Watch SE pro max", 33000));
//		}
//		catch(ShopException e)
//		
//		{
//			System.out.println(e);
//		}
	}

}
