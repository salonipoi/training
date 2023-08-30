public class demooo {

 

    public static void main(String[] args) {

        

        int[] ar = {1, 2, 3, 4, 5};

        

        for (int i = 0; i < ar.length; i++) {

            System.out.println(ar[i]);

        }

        

        // Using for-each loop

        for (int i : ar) {

            System.out.println(i);

        }

        

        int[][] mat = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {

                System.out.print(mat[i][j] + "\t");

            }

            System.out.println();

            }

        

        int[][] jag = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };

        for (int[] is : jag) {

            for(int j : is)

            {

                System.out.print(j+ "\t");

        }

            System.out.println();

}
Object obj =  new Object();
int i =9;
String s1=new String ("Hello");
String s2= "Hello";
Integer intgr = new Integer(100);
Integer intgr2 = 100;
System.out.println(s2);
        }

}