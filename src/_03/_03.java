package _03;

import java.util.Scanner;

/**
 * 3. 최대 매출
 *  Time Limit Exceeded ?
 */
public class _03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int answer = 0;
		int sum = 0;

		for (int i = 0; i < m; i++) {
			sum += arr[i];
			answer = sum;
		}

		for (int i = m; i < n; i++) {
			sum += arr[i];
			sum -= arr[i-m];
			if (answer < sum) {
				answer = sum;
			}
		}
		System.out.println(answer);
	}
}
