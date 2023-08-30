public class sampled {
    public static void main(String[] args) {
        String input = "saloni@gmail.com"; // Change this to the string you want to split
        int atIndex = input.indexOf('@');
        int dotIndex = input.indexOf('.');      
        String[] parts = input.split("[@.]"); // Escape the pipe character

       
        for (int i = 0; i <parts.length;i++)
        {
            //System.out.println("Part " + (i + 1) + ": " + parts[i]);  just checking          
        }
        int a =parts[0].length();
        int b =parts[1].length();
        int c =parts[2].length();
       System.out.println(parts[0]);
        System.out.println(b);
        System.out.println(c); 
        
        
       if (a >= 4 && b >= 3 && c >= 2 && atIndex != -1 && dotIndex != -1 && atIndex == input.lastIndexOf('@') && dotIndex == input.lastIndexOf('.'))
        {
        		System.out.println("Valid");       
        }		
        
   /**     if (a >= 4 && b >= 3 && c >= 2 && atIndex != -1 && atIndex == input.lastIndexOf('@') )
        {
        		System.out.println("Valid");       
        }	
        for saloni.belli@gmail.com 
     */
     
       else
        System.out.println("Invalid");
        	
    }
    }

