import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main2108 { // 통계학

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

	// 산술평균
	static int getAverage() {
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		avg = Math.round(sum / n);
		return (int)avg;
	}

	// 중앙값
	static int getMedian() {
		return arr[n / 2];	
	}

	// 최빈값
	static int getFrequent() {
		int max = 0; // 최대 빈도 값
		int maxIdx = 0; // 최대 빈도 값의 인덱스 값
		boolean flag = false; // 동일한 최빈값이 1번 등장했으면 true
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
	// 범위
	static int getRange() {
		return arr[n - 1] - arr[0];
	}
}
