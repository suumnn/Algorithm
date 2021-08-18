import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149 { // RGB 거리

	static int[][] data;
	static int[][] dp; // R: 0, G: 1, B: 2

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		data = new int[n][3];
		dp = new int[n][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());	
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
			data[i][2] = Integer.parseInt(st.nextToken());
		}

		dp[0][0] = data[0][0];
		dp[0][1] = data[0][1];
		dp[0][2] = data[0][2];

		System.out.println(Math.min(paint(n - 1, 0), Math.min(paint(n - 1, 1), paint(n - 1, 2))));
	}

	// color - R: 0, G: 1, B: 2
	static int paint(int n, int color) {
		// 아직 탐색하지 않았다면
		if (dp[n][color] == 0) {
			if (color == 0) { // R
				dp[n][0] = Math.min(paint(n - 1, 1), paint(n - 1, 2)) + data[n][0];
			} 
			else if (color == 1) { // G
				dp[n][1] = Math.min(paint(n - 1, 0), paint(n - 1, 2)) + data[n][1];
			}
			else { // B
				dp[n][2] = Math.min(paint(n - 1, 0), paint(n - 1, 1)) + data[n][2];
			}
		}
		return dp[n][color];
	}
}