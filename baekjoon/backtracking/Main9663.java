import java.util.Scanner;

public class Main9663 { // N-Queen
	static int n;
	static int cnt;
	static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		map = new int[n]; // 행 기준 - 인덱스가 행, 값이 열

		nQueen(0);
		System.out.println(cnt);

	}

	static void nQueen(int depth) {
		if (depth == n) { // 한 행의 모든 열을 다 채운 상태이면
			cnt++;
			return;
		}

		for (int i = 0; i < n; i++) { // 해당 행의 열을 처음부터 n까지 탐색
			map[depth] = i;

			// 놓을 수 있는 경우 다음 행 재귀
			if (isPossible(depth))
				nQueen(depth + 1);
		}
	}

	// 퀸을 놓을 수 있는 자리인가 체크
	static boolean isPossible(int row) {
		// 현재 퀸을 놓으려는 행의 이전 행들을 검사
		for (int i = 0; i < row; i++) {
			// 퀸이 같은 열에 존재할 경우
			if (map[row] == map[i]) {
				return false;
			}
			// 퀸이 대각선상에 놓여있을 경우 - 행의 차와 열의 차가 같을 때
			if (Math.abs(row - i) == Math.abs(map[row] - map[i])) {
				return false;
			}	
		}
		return true;
	}
}