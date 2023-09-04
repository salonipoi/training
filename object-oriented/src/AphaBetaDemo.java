
public class AphaBetaDemo {

	public static void main(String[] args) {

	//	Alpha a = new Alpha();
	//	a.demo();
		Beta b = new Beta();
	//	b.test();

		Alpha ab = b;// up-casting (Implicit)
		ab.demo();
		
		//Beta c = 
		// ab.test(); error

	//	Beta ba = (Beta) ab; // down-casting (Explicit)
	}

}
