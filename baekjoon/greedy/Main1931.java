import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1931 { // ȸ�ǽ� ����

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2]; // ȸ���� ��, ����-�� �ð�

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); // ����
			arr[i][1] = Integer.parseInt(st.nextToken()); // ��
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int cnt = 0;
		int end = 0; // ���� ȸ���� ���� �ð�
		for (int i = 0; i < n; i++) {
			if (end <= arr[i][0]) { // ������ ����ð����� ���ο� ȸ���� ���۽ð��� ����
				end = arr[i][1]; // ���� �񱳸� ���� end ���� ��������
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}