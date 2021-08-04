import java.util.Scanner;

public class Main2231 { // 분해합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		// 작은 수부터 시작해서 n까지
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int x = i;

			// 자리수 나누면서 더하기
			while (x != 0) {
				sum += x % 10;
				x /= 10;
			}

			if (i + sum == n) {
				result = i;
				break;
			}
		}
		if (result == 0) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}
	}
}
