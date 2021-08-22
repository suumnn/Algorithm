import java.util.Scanner;

public class Main10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] dp = new long[n + 1][10]; // [����][�ڸ���]


		// ���̰� 1�� ���� ��찡 1�� �ۿ� ����
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) { // 0 ~ 9
				if (j == 0) { // ���ڸ��� 0�̸� +1�� ����
					dp[i][j] = dp[i - 1][j + 1] % 1000000000;
				}
				else if (j == 9) { // ���ڸ��� 9�̸� -1�� ����
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