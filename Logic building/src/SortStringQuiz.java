import java.util.Scanner;

public class SortStringQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word = console.next();
		System.out.println(sort(word));

	}

	private static String sort(String word) {
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++)
			for (int j = 0; j < chars.length; j++) {
				Character x = chars[i];
				Character y = chars[j];
				if (x.compareTo(y) < 0) {
					char c = chars[i];
					chars[i] = chars[j];
					chars[j] = c;
				}
			}
		return new String(chars);
	}
}

//"hello" -> ehllo