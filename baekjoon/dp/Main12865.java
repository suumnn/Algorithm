import java.util.Scanner;

public class Main12865 { // 평범한 배낭

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 물품의 수
		int k = sc.nextInt(); // 버틸 수 있는 무게

		int[] w = new int[n + 1]; // 무게
		int[] v = new int[n + 1]; // 가치

		int[][] dp = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) { // 물품
			for (int j = 1; j <= k; j++) { // 가능 무게
				dp[i][j] = dp[i - 1][j];

				if (j - w[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				}
			}
		}

		System.out.println(dp[n][k]);
	}
}