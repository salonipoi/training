import java.lang.reflect.Constructor;

public class DynamicProductReflection {

	public static void main(String[] args) throws Exception {
		Class pc = Class.forName("com.ey.shop.Product");
		Constructor ctr = pc.getConstructor(String.class, double.class);
		Object obj = ctr.newInstance("Nokia 3310", 1600);
		System.out.println(obj);

	}

}
