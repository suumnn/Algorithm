import java.util.Scanner;

public class Main15651 { // N°ú M (3)

	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		perm(0);

		System.out.println(sb);
	}

	static void perm(int cnt) {
		if (cnt == m) {
			for (int i : arr) {
				sb.append(i + " ");
			} 
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			arr[cnt] = i;
			perm(cnt + 1);
		}
	}
}