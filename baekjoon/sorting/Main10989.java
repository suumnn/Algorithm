import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10989 { // �� �����ϱ�3 - ī���� ����

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] counting = new int[10001];
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			counting[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 1; i < 10001; i++) {
			while (counting[i] > 0) {
				bw.write(i + "\n");
				counting[i]--;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
