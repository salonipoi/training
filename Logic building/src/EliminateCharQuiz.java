
public class EliminateCharQuiz {

	public static void main(String[] args) {
		String str = "Hello-Beautiful-World";
		System.out.println(eliminate(str, "-", str, str, str));
	}

	private static String eliminate(String str, String ch, String a, String b, String c) {
		String[] mail = str.split("[-]");
		for (int i = 0; i < mail.length; i++) {
		}
		return mail[0] + " " + mail[1] + " " + mail[2];
	}
}
