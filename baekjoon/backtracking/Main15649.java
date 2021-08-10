import java.util.Scanner;

public class Main15649 { // N�� M (1)

	static int[] arr; // Ž�� �������� ���� ���� �迭
	static boolean[] visited; // �湮�� ����� ���� ��� Ž���ϱ� ����
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // n�� �߿�
		m = sc.nextInt(); // m���� �����Ѵ�

		arr = new int[m];
		visited = new boolean[n];
		perm(0);
		System.out.println(sb);
	}

	static void perm(int cnt) {
		if (cnt == m) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[cnt] = i + 1;
				perm(cnt + 1);
				visited[i] = false;
			}
		}
	}
}
