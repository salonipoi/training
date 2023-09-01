import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import com.ey.shop.Product;

public class ProdutReflection {

	public static void main(String[] args) throws Exception {

//		 Product p1 = new Product("Parker", 120);
//		// p1.print(); 
//		 System.out.println(p1);
//		 
//
//		Class pc = p1.getClass();
		Class pc = Class.forName("com.ey.shop.Product");
		System.out.println(pc.getName());
		System.out.println(pc.getPackageName());
		System.out.println(pc.getSimpleName());

		System.err.println("--List of constructors");
		Constructor[] constructors = pc.getConstructors();
		for (Constructor c : constructors)
			System.out.println(c);

		System.err.println("--List of Methods");
		Method[] methods = pc.getMethods();
		for (Method m : methods)
			System.out.println(m);

		System.err.println("--List of declared methods ");
		Method[] decMethods = pc.getDeclaredMethods();
		for (Method m : decMethods)
			System.out.println(m);

		System.err.println("--List of fields");
		Field[] field = pc.getDeclaredFields();
		for (Field f : field)
			System.out.println(f);
	}

}
