import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6603 { // 로또

	static final int num = 6;
	static int k;
	static int[] s;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());

			k = Integer.parseInt(st.nextToken());

			if (k == 0) {
				break;
			}

			s = new int[k];
			visited = new boolean[k];

			for (int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}

			dfs(0, 0);
			System.out.println();
		}
	}

	static void dfs(int start, int depth) {
		if (depth == num) {
			// 출력
			for (int i = 0; i < k; i++) {
				if (visited[i]) {
					System.out.print(s[i] + " ");
				}
			}
			System.out.println();
		}

		for (int i = start; i < k; i++) {
			visited[i] = true;
			dfs(i + 1, depth + 1);
			visited[i] = false;
		}
	}

}
