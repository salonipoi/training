public class play 
{
    public static void main(String[] args) 
    {      
		String email = "saloni@gmail.com";
		String[] words = email.split("@");
		
		{//part1 open
        int indexToCheck=0;			// Change this to the desired index 
        if (indexToCheck == 0 && indexToCheck < words.length)
        {
            String word = words[indexToCheck];
            int length = word.length();
            //word contains p1: saloni 
            //length contains length of p1
           // System.out.println("Length of '" + word + "': " + length);
            if (length >= 4)
            {
            	System.out.println("Valid");
            }
            else
            	System.out.println("Invalid");
        } 
        }//part 1 close
        
		{//part2 open
	        int indexToCheck=1;			// Change this to the desired index 
	        if (indexToCheck == 1 && indexToCheck < words.length)
	        {
	            String word = words[indexToCheck];
	            String[] p1 = word.split(".");
	            int length = p1.length;
	            System.out.println(length);
	            //word contains p1: saloni 
	            //length contains length of p1
	           // System.out.println("Length of '" + word + "': " + length);
	/**            if (length >= 3)
	            {
	            	System.out.println("Valid");
	            }
	            else
	            	System.out.println("Invalid");
	            	
	            	*/
	        } 
	        }//part 2 close
        
        
 
        
    }
}
