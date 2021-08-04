import java.util.Scanner;

public class Main7568 { // µ¢Ä¡

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n; j++) {
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
