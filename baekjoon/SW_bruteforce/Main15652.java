import java.util.Scanner;

public class Main15652 {// N & M - 4 (2번과 유사)

	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];

		dfs(1, 0);
		System.out.print(sb);		
	}

	static void dfs(int start, int depth) {
		if (depth == m) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i <= n; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}

}
