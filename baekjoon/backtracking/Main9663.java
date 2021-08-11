import java.util.Scanner;

public class Main9663 { // N-Queen
	static int n;
	static int cnt;
	static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		map = new int[n]; // �� ���� - �ε����� ��, ���� ��

		nQueen(0);
		System.out.println(cnt);

	}

	static void nQueen(int depth) {
		if (depth == n) { // �� ���� ��� ���� �� ä�� �����̸�
			cnt++;
			return;
		}

		for (int i = 0; i < n; i++) { // �ش� ���� ���� ó������ n���� Ž��
			map[depth] = i;

			// ���� �� �ִ� ��� ���� �� ���
			if (isPossible(depth))
				nQueen(depth + 1);
		}
	}

	// ���� ���� �� �ִ� �ڸ��ΰ� üũ
	static boolean isPossible(int row) {
		// ���� ���� �������� ���� ���� ����� �˻�
		for (int i = 0; i < row; i++) {
			// ���� ���� ���� ������ ���
			if (map[row] == map[i]) {
				return false;
			}
			// ���� �밢���� �������� ��� - ���� ���� ���� ���� ���� ��
			if (Math.abs(row - i) == Math.abs(map[row] - map[i])) {
				return false;
			}	
		}
		return true;
	}
}