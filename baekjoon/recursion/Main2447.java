import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main2447 {

	static char[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		star(n, 0, 0);
		for (int i = 0; i < n; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

	static void star(int n, int x, int y) {
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		n /= 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				else
					star(n, x + (n * i), y + (n * j));
			}
		}
	}
}