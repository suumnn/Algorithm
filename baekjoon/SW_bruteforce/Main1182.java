import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1182 { // 부분수열의 합

	static int n;
	static int s; // 수열의 원소를 다 더한 값이 s가 되는 경우의 수를 구하기
	static int cnt;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());

		arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0);

		// s가 0 인 경우 공집합도 포함되니까 그 수를 하나 빼주기
		if (s == 0) {
			cnt--;
		}
		System.out.println(cnt);
	}

	static void dfs(int idx, int sum) {
		// 마지막 위치로 오면 값 체크
		if (idx == n) {
			if (sum == s) {
				cnt++;
			}
			return;
		}

		// 부분 수열
		// 지금 위치의 원소를 선택
		dfs(idx + 1, sum + arr[idx]);
		// 지금 위치의 원소를 선택하지 않음
		dfs(idx + 1, sum);
	}

}
