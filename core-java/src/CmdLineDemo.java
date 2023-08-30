
public class CmdLineDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (String a : args) {
			System.out.println(a + " ");
			sum = sum + Integer.parseInt(a);
		}
		System.out.println();
		System.out.println(sum);
		int x = 5;
		Integer xo = x;// x is boxed into xo
		int z = xo;// taking the int primitive into the z:unboxing
		System.out.println(x + xo * z);
		// System.out.println(Integer.parseInt(x) + Integer.parseInt(xo) *
		// Integer.parseInt(z));// when java takes care of
		// boxing and unboxing
		// :it is called Auto
		// boxing

	}

}
//run>run menu>run config> main: class name >arguments: program args : 4 words> run