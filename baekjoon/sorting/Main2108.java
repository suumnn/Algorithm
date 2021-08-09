import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main2108 { // �����

	static int n;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		bw.write(getAverage() + "\n");
		bw.write(getMedian() + "\n");
		bw.write(getFrequent() + "\n");
		bw.write(getRange() + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

	// ������
	static int getAverage() {
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		avg = Math.round(sum / n);
		return (int)avg;
	}

	// �߾Ӱ�
	static int getMedian() {
		return arr[n / 2];	
	}

	// �ֺ�
	static int getFrequent() {
		int max = 0; // �ִ� �� ��
		int maxIdx = 0; // �ִ� �� ���� �ε��� ��
		boolean flag = false; // ������ �ֺ��� 1�� ���������� true
		int[] counting = new int[8001]; // -4000 ~ 4000

		for (int i = 0; i < arr.length; i++) {
			counting[arr[i] + 4000]++;
			//max = Math.max(max, counting[arr[i] + 4000]);
		}

		for (int i = 0; i < counting.length; i++) {
			if (max < counting[i]) {
				max = counting[i];
				maxIdx = i - 4000;
				flag = true;
			} else if (max == counting[i] && flag == true) {
				maxIdx = i - 4000;
				flag = false;
			}
		}	
		
		if (n == 1) return arr[0];
		else return maxIdx;
	}
	// ����
	static int getRange() {
		return arr[n - 1] - arr[0];
	}
}
