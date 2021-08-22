import java.util.Scanner;

public class Main10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] dp = new long[n + 1][10]; // [길이][자리값]


		// 길이가 1인 수는 경우가 1개 밖에 없음
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) { // 0 ~ 9
				if (j == 0) { // 끝자리가 0이면 +1만 가능
					dp[i][j] = dp[i - 1][j + 1] % 1000000000;
				}
				else if (j == 9) { // 끝자리가 9이면 -1만 가능
					dp[i][j] = dp[i - 1][j - 1] % 1000000000;
				}
				else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
				}
			}
		}

		long sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += dp[n][i];
		}
		System.out.println(sum % 1000000000);
	}
}