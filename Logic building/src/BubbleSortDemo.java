
public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 10, 2, 1, 8, 5, 4, 7 };
		int temp;
		// bubble sort
		for (int a = 0; a < arr.length; a++)
			for (int i = 0; i < arr.length; i++)
				for (int j = 0; j < i; j++) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
