import java.util.Scanner;

public class Main14501 { // 퇴사

	static int n;
	static int max;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // 상담 기간
			arr[i][1] = sc.nextInt(); // 상담 금액
		}
		
		dfs(0, 0);
		System.out.println(max);
	}
	
	static void dfs(int idx, int cost) {
		if (idx >= n) {
			max = Math.max(max, cost);
			return;
		}
		
		// 상담기간 더한 게 n보다 작으면 기간과 금액 더해서 그 날로 넘어가기
		if (idx + arr[idx][0] <= n) {
			dfs(idx + arr[idx][0], cost + arr[idx][1]);
		}
		
		// 일을 하지 않는 경우
		dfs(idx + 1, cost);
	}

}
