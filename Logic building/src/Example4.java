
public class Example4 {

	public static void main(String[] args) {
//Check validity of statement
		// quote String must contain at least one word form vocab array
		// in failure to that quote will be considered invalid,

		String[] vocab = { "is", "are", "am", "of", "an", "a" };
		String quote = "These are Apples";

		// Write your logic to check the validity here,and print result,.

		boolean flag = false;
		for (String word : vocab) {
			if (quote.indexOf(word) != -1) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Valid quote" : "Invalid quote");

	}
}
