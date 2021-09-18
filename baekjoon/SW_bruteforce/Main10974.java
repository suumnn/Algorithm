import java.util.Scanner;

public class Main10974 { // 모든 순열

	static int n;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];
		visited = new boolean[n];

		dfs(0);
	}

	static void dfs (int depth) {
		if (depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

}
