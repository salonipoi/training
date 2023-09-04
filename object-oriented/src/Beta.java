
public class Beta extends Alpha {
	public Beta() {
		System.out.println("Beta constructor");
	}

	public void test() {
		System.out.println("Beta test");
	}

	public void demo() {
		System.out.println("Beta demo");
	}
	/**
	 * public static void main(String args[]) { Beta b = new Beta(); b.test();
	 * 
	 * Alpha ab=b;//up-casting (Implicit) ab.demo(); // ab.test(); error
	 * 
	 * Beta ba = (Beta) ab; //down-casting (Explicit)
	 * 
	 * }
	 */
}
