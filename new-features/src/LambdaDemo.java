import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}

//function reference works with static methods
	// scope functions operators
	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Hello"); // Hello

		Consumer<String> c2 = System.out::println;
		c2.accept("Bonjour"); // Bonjour

		Consumer<String> c3 = LambdaDemo::print;
		c3.accept("Aloha"); // Aloha

		Consumer<Integer> c4 = LambdaDemo::print;
		c4.accept(100); // 100

		Supplier<String> s1 = () -> "Adios";
		System.out.println(s1.get()); // Adios

		Supplier<Integer> s2 = () -> (int) (Math.random() * 100);
		System.out.println(s2.get()); // random output

		Predicate<Integer> positive = (x) -> x >= 0;
		System.out.println(positive.test(-5));// False
		System.out.println(positive.test(9));// True

		Predicate<Integer> even = (x) -> x % 2 == 0;
		System.out.println(even.test(3));// False
		System.out.println(even.test(4));// True

		BiPredicate<String, String> contains = (s, c) -> s.contains(c);
		System.out.println(contains.test("Hello", "a"));// False
		System.out.println(contains.test("Hello", "l"));// True

		Function<Integer, Integer> square = (x) -> x * x;
		System.out.println(square.apply(5));// 25

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(10, 20));// 30

	}

}
