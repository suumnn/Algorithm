import java.util.Scanner;

public class Main14501 { // ���

	static int n;
	static int max;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // ��� �Ⱓ
			arr[i][1] = sc.nextInt(); // ��� �ݾ�
		}
		
		dfs(0, 0);
		System.out.println(max);
	}
	
	static void dfs(int idx, int cost) {
		if (idx >= n) {
			max = Math.max(max, cost);
			return;
		}
		
		// ���Ⱓ ���� �� n���� ������ �Ⱓ�� �ݾ� ���ؼ� �� ���� �Ѿ��
		if (idx + arr[idx][0] <= n) {
			dfs(idx + arr[idx][0], cost + arr[idx][1]);
		}
		
		// ���� ���� �ʴ� ���
		dfs(idx + 1, cost);
	}

}
