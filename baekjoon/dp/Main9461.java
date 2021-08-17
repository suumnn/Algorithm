import java.util.Scanner;

public class Main9461 { // �ĵ��� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		long[] dp = new long[101];
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for (int i = 4; i < 101; i++) {
			dp[i] = dp[i - 2] + dp[i - 3];
		}
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}
}