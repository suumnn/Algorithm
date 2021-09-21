import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1182 { // �κм����� ��

	static int n;
	static int s; // ������ ���Ҹ� �� ���� ���� s�� �Ǵ� ����� ���� ���ϱ�
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

		// s�� 0 �� ��� �����յ� ���ԵǴϱ� �� ���� �ϳ� ���ֱ�
		if (s == 0) {
			cnt--;
		}
		System.out.println(cnt);
	}

	static void dfs(int idx, int sum) {
		// ������ ��ġ�� ���� �� üũ
		if (idx == n) {
			if (sum == s) {
				cnt++;
			}
			return;
		}

		// �κ� ����
		// ���� ��ġ�� ���Ҹ� ����
		dfs(idx + 1, sum + arr[idx]);
		// ���� ��ġ�� ���Ҹ� �������� ����
		dfs(idx + 1, sum);
	}

}
