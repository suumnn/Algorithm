import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1541 { // 잃어버린 괄호

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stSub = new StringTokenizer(br.readLine(), "-");

		int sum = Integer.MAX_VALUE;

		while(stSub.hasMoreTokens()) { // 먼저 -으로 분류
			int tmp = 0;

			// -으로 분류된 토큰을 +으로 또 분리
			StringTokenizer stAdd = new StringTokenizer(stSub.nextToken(), "+");
			// +으로 분리된 토큰들을 더한다
			while (stAdd.hasMoreTokens()) {
				tmp += Integer.parseInt(stAdd.nextToken());
			}

			// 첫번째 토큰이면 tmp값이 첫번째 수, 첫번째 수는 양수이므로 빼 줄 필요X
			if (sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {
				sum -= tmp;
			}

		}

		System.out.println(sum);		
	}

}
