import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932 { // Á¤¼ö »ï°¢Çü

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][n];
		int[][] dp = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}

		dp[0][0] = map[0][0];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][0] = dp[i - 1][0] + map[i][0];
				} 
				else if (i == j) {
					dp[i][j] = dp[i - 1][j - 1] + map[i][j];
				} 
				else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + map[i][j];
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[n - 1][i], max);
		}

		System.out.println(max);
	}
}