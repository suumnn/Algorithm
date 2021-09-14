import java.util.Arrays;
import java.util.Scanner;

public class Main2309 { // ÀÏ°ö ³­ÀïÀÌ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 9;
		int[] arr = new int[n];
		int sum = 0;
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i = 0; i < n; i++) {
			if (flag)
				break;

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					flag = true;
					break;
				}
			}
		}

		Arrays.sort(arr);

		for (int i : arr) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

}
