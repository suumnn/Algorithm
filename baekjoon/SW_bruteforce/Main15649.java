import java.util.Scanner;

public class Main15649 { // N & M - 1

	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		visited = new boolean[n];

		perm(0);

	}

	static void perm(int depth) {
		if (depth == m) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				perm(depth + 1);
				visited[i] = false;
			}
		}
	}

}
