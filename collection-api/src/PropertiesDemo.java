import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("src/person.txt");
		Properties p = new Properties();
		p.load(reader);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("city"));
	}

}
//use filereader to read al line in a file
//use load() to load the reader obj 
//to store large quantity of data we use collecttion api
