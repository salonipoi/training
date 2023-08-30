import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {

		// ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		// ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.FRENCH);

		Locale desi = new Locale("hi");// give the initial of that doc
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", desi);

		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}

}

//its declared in final class:public static final Locale
//2 questions from this example