public class Assignment01
{
    public static void main(String[] args) 
    {
        String input = "saloni@gmail.com"; 
        int atIndex = input.indexOf('@');
        int dotIndex = input.indexOf('.');      
        String[] parts = input.split("[@.]");
        for (int i = 0; i <parts.length;i++)
        {
            //System.out.println("Part " + (i + 1) + ": " + parts[i]);  just checking          
        }
        int a =parts[0].length();
        int b =parts[1].length();
        int c =parts[2].length();
       if (a >= 4 && b >= 3 && c >= 2 && atIndex != -1 && dotIndex != -1 && atIndex == input.lastIndexOf('@') && dotIndex == input.lastIndexOf('.') && !containsSpecialCharacters(parts[0]))
       {
    	   System.out.println("Valid"); 
       }        
       else
        System.err.println("Invalid");        
   }
   
   public static boolean containsSpecialCharacters(String input) 
   {
       for (char c : input.toCharArray())
       {
           if (!Character.isLetterOrDigit(c)) 
           {
               return true;
           }
       }
       return false;
   }
  }

