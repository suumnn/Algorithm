import java.util.Arrays;
import java.util.Scanner;

public class Main15663 {// N & M - 9

	static int n;
	static int m;
	static int[] arr;
	static int[] res;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];
		res = new int[m];
		visited = new boolean[n];

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

		int pre = 0;
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				if (i == 0 || pre != arr[i]) {
					pre = arr[i];
					visited[i] = true;
					res[depth] = arr[i];
					dfs(depth + 1);
					visited[i] = false;
				}
			}
		}
	}

}
