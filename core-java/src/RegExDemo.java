
public class RegExDemo {

	public static void main(String[] args) {
		String name = "Saloni";
		String mobile = "9591395632";
		String email = "saloni@gmail.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";//1 cap, 3 or more small		
		String mobileRegex = "[6-9]{1}[0-9]{9}";
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		System.out.println(name.matches(nameRegex)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileRegex)?"Valid number":"Invalid number");
		System.out.println(email.matches(emailRegex)?"Valid email":"Invalid email");
		
	}

}
