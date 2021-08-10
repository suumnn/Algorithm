import java.util.Scanner;

public class Main15650 {// N°ú M (2)

	static boolean[] visited;
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		visited = new boolean[n + 1];
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
			if (!visited[i]) {
				if (cnt == 0 || arr[cnt - 1] < i) {
					visited[i] = true;
					arr[cnt] = i;
					perm(cnt + 1);
					visited[i] = false;
				}
			}
		}
	}
}
