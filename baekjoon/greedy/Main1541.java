import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1541 { // �Ҿ���� ��ȣ

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stSub = new StringTokenizer(br.readLine(), "-");

		int sum = Integer.MAX_VALUE;

		while(stSub.hasMoreTokens()) { // ���� -���� �з�
			int tmp = 0;

			// -���� �з��� ��ū�� +���� �� �и�
			StringTokenizer stAdd = new StringTokenizer(stSub.nextToken(), "+");
			// +���� �и��� ��ū���� ���Ѵ�
			while (stAdd.hasMoreTokens()) {
				tmp += Integer.parseInt(stAdd.nextToken());
			}

			// ù��° ��ū�̸� tmp���� ù��° ��, ù��° ���� ����̹Ƿ� �� �� �ʿ�X
			if (sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {
				sum -= tmp;
			}

		}

		System.out.println(sum);		
	}

}
