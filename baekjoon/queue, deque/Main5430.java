import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Main5430 {

	static Deque<Integer> dq;
	static String p;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			p = br.readLine(); // 수행할 함수
			int n = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 개수
			String[] arr = br.readLine().replace("[", "").replace("]", "").split(",");
			
			if (n == 0) {
				dq = new LinkedList<>();
			} else {
				dq = makeDq(n, arr);
			}
			
			
		}
	}
	
	static void AC() {
		boolean errFlag = true;
		int cnt = 0;
		
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == 'R') {
				cnt++;
			} else if (p.charAt(i) == 'D') {
				if (!errFlag) {
					errFlag = false;
					break;
				}
				
				if (cnt % 2 == 0) { // RR == R
					dq.pollFirst();
				} else {
					dq.pollLast();
				}
			}
		}
		
		if (cnt % 2 != 0) {
			
		}
	}
	
	static Deque<Integer> makeDq(int n, String[] arr) {
		dq = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			dq.offer(Integer.parseInt(arr[i]));
		}
		return dq;
	}

}
