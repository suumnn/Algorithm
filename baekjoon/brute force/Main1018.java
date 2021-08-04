import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 { // 체스판 다시 칠하기

	static int min = 64;
	static boolean[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 기존 보드의 크기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// W: true, B: false
		arr = new boolean[n][m]; 
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				if (line.charAt(j) == 'W')
					arr[i][j] = true;
				else
					arr[i][j] = false;
			}
		}
		
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				makeChess(i, j);
			}
		}
		System.out.println(min);
	}

	static void makeChess(int a, int b) {
		int count = 0;
		boolean color = arr[a][b];

		for (int i = a; i < a + 8; i++) {
			for (int j = b; j < b + 8; j++) {
				if (arr[i][j] != color)
					count++;

				color = !color;
			}
			color = !color;
		}
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}
