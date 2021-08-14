import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main14889 { // 스타트와 링크

	static int n;
	static int min = Integer.MAX_VALUE;
	static int[][] mat;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		mat = new int[n][n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		System.out.println(min);
	}

	static void dfs(int idx, int cnt) {
		// 종료 조건
		if (cnt == n / 2) {
			diff();
			return;
		}

		for (int i = idx; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i + 1, cnt + 1);
				visited[i] = false;
			}
		}
	}

	// 두 팀의 능력치 차이 계산
	static void diff() {
		int start = 0;
		int link = 0;

		// 중복으로 선택되는 것을 막기 위해 범위 설정
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// 스타트팀
				if (visited[i] == true && visited[j] == true) {
					start += mat[i][j];
					start += mat[j][i];
				}
				// 링크팀
				else if (visited[i] == false && visited[j] == false) {
					link += mat[i][j];
					link += mat[j][i];
				}				
			}
		}

		int res = Math.abs(start - link);
		if (res == 0) {
			System.out.println(res);
			System.exit(0);
		}

		min = Math.min(res, min);
	}
}