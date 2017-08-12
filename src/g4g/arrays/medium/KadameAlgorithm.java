package g4g.arrays.medium;

import java.util.Scanner;

public class KadameAlgorithm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();

		while (testCount-- != 0) {
			int n = scanner.nextInt();

			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}

			KadameAlgorithm kadameAlgorithm = new KadameAlgorithm();
			int result = kadameAlgorithm.solution(a);
			System.out.println(result);
		}
	}

	int solution(int[] input) {
		int[] sumArray = new int[input.length + 1];

		int currentMaximum = Integer.MIN_VALUE;

		for (int i = 1; i < sumArray.length; i++) {
			int prefixSum = sumArray[i - 1] + input[i - 1];
			sumArray[i] = prefixSum;

			if (currentMaximum < prefixSum) {
				currentMaximum = prefixSum;
			}
			if (prefixSum < 0) {
				sumArray[i] = 0;
			}
		}

		return currentMaximum;
	}
}
