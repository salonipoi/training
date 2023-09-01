import java.util.Scanner;

public class PalindromeQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word = console.next();
		System.out.println(checkPalindrome(word) ? "Palindrome" : "Not Palindrome");

	}

	private static boolean checkPalindrome(String word) {
		int len = word.length();
		for (int i = 0, l = len - 1; i <= len / 2; i++, l--)
			if (word.charAt(i) != word.charAt(l))
				return false;
		// return StringBuilder(word).reverse().equals(word);

		return true;
	}

}
