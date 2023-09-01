import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] ar = { 5, 3, 1, 2, 4 };

		for (int i : ar)

			System.out.println(i);

		/*
		 * System.out.println("--Sorting array with Java API--"); Arrays.sort(ar); long
		 * start = System.currentTimeMillis(); Arrays.sort(ar); long end =
		 * System.currentTimeMillis(); System.out.println("Time taken :" + (end - start)
		 * + "ms");
		 * 
		 * for (int i : ar) System.out.println(i);
		 * 
		 */
		System.out.println("BubbleSort");
		//long Start = System.currentTimeMillis();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length ; j++) {
				
					if (ar[i] < ar[j]) {
						int x = ar[i];
						ar[i] = ar[j];
						ar[j] = x;

					}
				}

			}
		//long end = System.currentTimeMillis();
		//System.out.println("Time TAken : " + (end - Start) + "ms");

		for (int i : ar)
			System.out.println(i);
	}
}
