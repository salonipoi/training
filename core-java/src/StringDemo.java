
public class StringDemo {

	public static void main(String[] args) 
	{
		String s1 = "Hello";//primitive style: created in string pool
		String s2 = new String("Hello");//object style: created in heap memory area 
		String s3 = "Hello";//primitive style: created in string pool
		
		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
// Comparing String Values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1 == s3);
		
		
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	
	System.out.println(s1.indexOf('o'));
	System.out.println(s1.lastIndexOf('o'));
	System.out.println(s1.charAt(5));
	
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,7));
	System.out.println(s1.replace('o','e'));
	System.out.println(s1);
	
	String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";//split week on bases of the -
	String[] days = week.split("-");//days contain the split of week
	for(String day : days) {//each split is contained in day
		System.out.println(day);//print day
	}
	
	String num1 = "10";
	String num2 = "20";
	System.out.println(num1 + num2);
	System.out.println(Integer.parseInt(num1) +Integer.parseInt(num2));
	
	
}
}
