import java.util.Scanner;

public class Main15650 { // N & M - 2

	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];

		perm(0, 0);
	}

	// 오름차순
	static void perm(int start, int depth) {
		if (depth == m) {
			sb = new StringBuilder();

			for (int i : arr) {
				sb.append(i + " ");
			}
			System.out.println(sb);
			return;
		}

		for (int i = start; i < n; i++) {
			arr[depth] = i + 1;
			perm(i + 1, depth + 1);
		}

	}
}
