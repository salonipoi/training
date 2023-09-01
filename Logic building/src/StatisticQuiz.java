public class StatisticQuiz {

	public static void main(String[] args) {

		int[] ar = { 3, 8, 2, 5, 9, 4, 7 };

		System.out.println("Sum: " + sum(ar));

		System.out.println("Max: " + max(ar));

		System.out.println("Min: " + min(ar));

		System.out.println("Avg: " + avg(ar));

	}

	private static int avg(int[] ar) {

		int sum = 0;

		for (int i : ar) {

			sum += i;

		}

		return sum / (ar.length);

	}

	private static int min(int[] ar) {

		int m = ar[0];

		for (int i : ar) {

			if (i < m)

				m = i;

		}

		return m;

	}

	private static int max(int[] ar) {

		int m = ar[0];

		for (int i : ar) {
			if (i > m)
				m = i;
		}
		return m;
	}
	private static int sum(int[] ar) {
		int sum = 0;
		for (int i : ar) {
			sum += i;
		}
		return sum;
	}
}
