import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1931 { // 회의실 배정

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2]; // 회의의 수, 시작-끝 시간

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); // 시작
			arr[i][1] = Integer.parseInt(st.nextToken()); // 끝
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int cnt = 0;
		int end = 0; // 이전 회의의 종료 시간
		for (int i = 0; i < n; i++) {
			if (end <= arr[i][0]) { // 이전의 종료시간보다 새로운 회의의 시작시간이 늦음
				end = arr[i][1]; // 다음 비교를 위해 end 값을 변경해줌
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}