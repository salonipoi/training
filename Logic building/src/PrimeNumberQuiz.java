import java.util.Scanner;

public class PrimeNumberQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = console.nextInt();
		System.out.println(checkPrime(num) ? "Prime no" : "Composite No");

	}

	private static boolean checkPrime(int num) {
		int count = 2;//0
		for (int i = 2; i <= num/2;i++) {
			if (num % i == 0)
				count++;
				break;
		}
		if (count != 0)
			return false;
		else
			return true;

	}

}
