import java.util.Scanner;

public class Main2580 { // sudoku

	static int[][] mat;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mat = new int[9][9];
		for (int i = 0; i < 9; i++) { // row
			for (int j = 0; j < 9; j++) { // column
				mat[i][j] = sc.nextInt();
			}
		}
		
		sudoku(0, 0);
		
	}
	
	static void sudoku(int row, int col) {
		// 1. 행이 다 채워졌으면 다음 행 시작 - 첫번째 열부터니까 0
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		// 2. 행렬이 전부 채워졌으면 출력
		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		// 만약 값이 0인 곳이라면 1~9 중에 어떤 수일지 검사
		if (mat[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (isPossible(row, col, i)) {
					mat[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			mat[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
	}
	
	static boolean isPossible(int row, int col, int value) {
		// 안되는 경우 3가지
		// 한 행 안에 있는 겹치는 열 원소가 있는가
		for (int i = 0; i < 9; i++) {
			if (mat[row][i] == value) {
				return false;
			}
		}
		// 한 열 안에 있는 겹치는 행 원소가 있는지
		for (int i = 0; i < 9; i++) {
			if (mat[i][col] == value) {
				return false;
			}
		}
		// 3*3 크기의 정사각형안에 겹치는 원소가 있는가
		int r = (row / 3) * 3;
		int c = (col / 3) * 3;
		
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (mat[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}