import java.util.Scanner;

public class Main2156 { // 포도주 시식

	static int[] arr;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n + 1];
		dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = -1;
		}

		dp[0] = 0;
		dp[1] = arr[1];

		if (n > 1) {
			dp[2] = arr[1] + arr[2];
		}

		/*
		 for (int i = 3; i <= n; i++) {
		 	dp[i] = Math.max(dp[i - 1],
		 				Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
		 }				
		 */
		
		System.out.println(wine(n));
	}

	static int wine(int n) {
		if (dp[n] == -1) {
			dp[n] = Math.max(wine(n - 1),
						Math.max(wine(n - 2),  wine(n - 3) + arr[n - 1]) + arr[n]);
		}
		return dp[n];
	}
}