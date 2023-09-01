//import java.util.Scanner;
//
//public class BinarySearchDemo {
//
//    int l=0;
//    int r;
//
//	int[] arr = { 2, 5, 9, 11, 13, 15,33,66 };
//	int find=11;
//	int n=arr.length+1;
//	
//		int mid=n/2;
//		
//		while(l<r) {
//			if(find==arr[mid]) {
//				System.out.println(find);
//			}
//			if(find<arr[mid]) {
//				r
//				
//			}
//			
//		}
//}
//
//	
////}
////
////		
////	for(int i = 0;i<=arr.length()/2;i++)
////	{
////		int[] len = arr;
////		if(len[i]==n) {
////			System.out.println("Element found");
////			
////		}
////		else
////		{
////			System.out.println("Elements not found");
////		}
////
////	}
//

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 5, 11, 23 };
		System.out.println("\n Enter the value to be found: ");
		Scanner console = new Scanner(System.in);
		int val=console.nextInt();
		//int val = 5;
		// first is sorting the array
		Arrays.sort(ar);
		// Displaying the sorted array
		System.out.print("Sorted array:");
		for (int i = 0; i < ar.length; i++) {
			
			System.out.print(ar[i]+", ");
		}
		
		
		// Binary Searching
		int left = 0;
		int right = ar.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (ar[mid] == val) {

				System.out.println("\n"+val + " is found at " + (mid+1));

				break;

			} else if (ar[mid] < val) {

				left = mid + 1;

			} else if (ar[mid] > val) {

				right = mid - 1;

			}
		}
	}
}