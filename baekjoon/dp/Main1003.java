import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1003 { // 피보나치 함수

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];

		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int[][] dp = new int[41][2]; // 40까지의 자연수와 0, 0과 1의 개수 저장

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		for (int j = 2; j < 41; j++) {
			dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
			dp[j][1] = dp[j - 1][1] + dp[j - 2][1];				
		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(dp[arr[i]][0] + " " + dp[arr[i]][1] + "\n");
		}

		bw.write(sb + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}