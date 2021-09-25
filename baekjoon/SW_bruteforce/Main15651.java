import java.util.Scanner;

public class Main15651 {// N & M - 3

	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];

		perm(0);
		System.out.print(sb);
	}

	static void perm(int depth) {
		if (depth == m) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			perm(depth + 1);
		}
	}

}
