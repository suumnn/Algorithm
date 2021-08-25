import java.util.Scanner;

public class Main11054 { // 가장 긴 바이토닉 부분 수열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] LtoRDp = new int[n];
		int[] RtoLDp = new int[n];
		int[] sumDp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 왼쪽에서 오른쪽으로 가면서 오름차순 DP LIS
		for (int i = 0; i < n; i++) {
			LtoRDp[i] = 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && LtoRDp[i] < LtoRDp[j] + 1) {
					LtoRDp[i] = LtoRDp[j] + 1;
				}
			}
		}

		// 오른쪽에서 왼쪽으로 가면서 오름차순 DP
		for (int i = n - 1; i >= 0; i--) {
			RtoLDp[i] = 1;

			for (int j = n - 1; j > i; j--) {
				if (arr[j] < arr[i] && RtoLDp[i] < RtoLDp[j] + 1) {
					RtoLDp[i] = RtoLDp[j] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			sumDp[i] = LtoRDp[i] + RtoLDp[i];
			max = Math.max(sumDp[i], max);
		}
		System.out.println(max - 1); // LtoR, RtoL 각 수열에 1 중복
	}
}