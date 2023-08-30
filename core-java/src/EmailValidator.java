public class EmailValidator 
{
	//1- Minimum 4 chars before @
	//2- Minimum 3 chars between @ and .
	//3- Minimum 2 chars after .
	//4-Only 1 occurrence of @ and . is allowed
	//Note : no regular expressions allowed
	//assignment : print if valid or invalid
	public static void main(String[] args) 	
	{
		String email = "saloni@gmail.com";
	//	String[] mail = email.split("@");
		int iat = email.indexOf('@');
		int idot = email.indexOf(',');
	/**	if (iat == email.lastIndexOf('@') && idot == email.lastIndexOf(',') && iat >= 4 && (idot - iat) >= 3 && (email.length() - idot) >= 2 )
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}
}
	*/
		System.out.println(iat == email.lastIndexOf('@') && idot == email.lastIndexOf(',') && iat >= 4 && (idot - iat) >= 3 && (email.length() - idot) >= 2?"Valid":"Invalid");
}}