import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
int[] ar = {1,2,3,4,5};
for (int i = 0; i < ar.length; i++)
{
	System.out.println(ar[i] +"");
}

//Using for-each loop

System.err.println("Jagged array");
	int[][] mat = { { 1,2,3},{4,5,6},{7,8,9}};
	for(int i =0;i< mat.length; i++)
	{
		for(int j = 0 ;j < mat[i].length;j++)
		{
			System.out.print(mat[i][j] + "\t");
		}
		System.out.println();
	}
	int[][] jag = {{1,2},{3,4,5},{6,7,8,9}};
	//Print row wise using for-each loop
	for(int[] row : jag) {
		for (int i : row) {
			System.out.println(i+"\t");
		}
		System.out.println();
	}
	
	//System.out.println("Using for each loop:");
	//for (int i : ar) {
	//	System.out.print(i);
//	}
}
	}


