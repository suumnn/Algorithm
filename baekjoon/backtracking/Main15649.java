import java.util.Scanner;

public class Main15649 { // N과 M (1)

	static int[] arr; // 탐색 과정에서 값을 담을 배열
	static boolean[] visited; // 방문한 노드라면 다음 노드 탐색하기 위해
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // n개 중에
		m = sc.nextInt(); // m개를 골라야한다

		arr = new int[m];
		visited = new boolean[n];
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

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[cnt] = i + 1;
				perm(cnt + 1);
				visited[i] = false;
			}
		}
	}
}
