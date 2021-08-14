import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main14888 { // 연산자 끼워넣기

	static int[] nums;
	static int[] oper;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		nums = new int[n];
		oper = new int[4];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}

		dfs(nums[0], 1);

		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(min));
		
		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int num, int idx) {
		if (idx == nums.length) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}

		for (int i = 0; i < oper.length; i++) {
			if (oper[i] > 0) {
				oper[i]--;

				switch (i) {
				case 0: dfs(num + nums[idx], idx + 1);	break;
				case 1: dfs(num - nums[idx], idx + 1);	break;
				case 2: dfs(num * nums[idx], idx + 1);	break;
				case 3: dfs(num / nums[idx], idx + 1);	break;
				}

				oper[i]++;
			}
		}
	}
}