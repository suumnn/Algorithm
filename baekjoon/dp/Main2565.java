import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2565 {

	public static void main(String[] args) { // 전깃줄
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][2]; // a, b 전봇대 2개
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// 왼쪽 기준 정렬
		Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

		for (int i = 0; i < dp.length; i++) {
			dp[i] = 1;

			for (int j = 0; j < i; j++) {
				if (arr[j][1] < arr[i][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}

		// 전체 n에서 lis를 빼는 것!
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(n - max);
	}
}