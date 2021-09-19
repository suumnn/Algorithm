import java.util.Scanner;

public class Main10819 { // 차이를 최대로

	static int n;
	static int ans;
	static int[] a;
	static int[] tmp;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = new int[n];
		tmp = new int[n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		dfs(0);
		System.out.println(ans);
	}

	static void dfs(int depth) {
		if (depth == n) {
			// 합을 구하고 비교
			int sum = 0;

			for (int i = 0; i < n - 1; i++) {
				sum += Math.abs(tmp[i] - tmp[i + 1]);
			}
			ans = Math.max(sum, ans);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				tmp[depth] = a[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

}
