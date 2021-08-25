import java.util.Scanner;

public class Main11053 { // ���� �� �����ϴ� �κ� ���� (LIS)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}

}
