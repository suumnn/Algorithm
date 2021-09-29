import java.util.Arrays;
import java.util.Scanner;

public class Main15656 {// N & M - 7

	static int n;
	static int m;
	static int[] arr;
	static int[] res;
	static StringBuilder sb = new StringBuilder();;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		res = new int[m];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		dfs(0);
		System.out.print(sb);		
	}

	static void dfs(int depth) {
		if (depth == m) {
			for (int i : res) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			res[depth] = arr[i];
			dfs(depth + 1);
		}
	}

}
