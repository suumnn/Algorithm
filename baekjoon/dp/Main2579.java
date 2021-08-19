import java.util.Scanner;

public class Main2579 {

	public static void main(String[] args) { // 계단 오르기
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		if (n == 1) {
			System.out.println(arr[1]);
			return;
		}

		dp[1] = arr[1];
		dp[2] = dp[1] + arr[2];

		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 3] + arr[i] + arr[i - 1], dp[i - 2] + arr[i]);
		}
		System.out.println(dp[n]);
	}
}