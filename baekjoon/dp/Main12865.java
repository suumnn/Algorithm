import java.util.Scanner;

public class Main12865 { // ����� �賶

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ��ǰ�� ��
		int k = sc.nextInt(); // ��ƿ �� �ִ� ����

		int[] w = new int[n + 1]; // ����
		int[] v = new int[n + 1]; // ��ġ

		int[][] dp = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) { // ��ǰ
			for (int j = 1; j <= k; j++) { // ���� ����
				dp[i][j] = dp[i - 1][j];

				if (j - w[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				}
			}
		}

		System.out.println(dp[n][k]);
	}
}