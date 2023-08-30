import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		
		System.out.println("Enter name:");
		String name = console.next();
		System.out.println("Enter you age:");
		int age = console.nextInt();

		System.out.println("Your name = " +name);	
		System.out.println("Your age = " +age);
		 
		
	}

}
