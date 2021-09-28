import java.util.Arrays;
import java.util.Scanner;

public class Main15655 {// N & M - 6

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

		dfs(0, 0);
		System.out.print(sb);		
	}

	// 오름차순
	static void dfs(int start, int depth) {
		if (depth == m) {
			for (int i : res) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < n; i++) {
			res[depth] = arr[i];
			dfs(i + 1, depth + 1);
		}
	}

}
