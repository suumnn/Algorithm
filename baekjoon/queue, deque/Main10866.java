import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main10866 { // µ¦

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		Deque<Integer> dq = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.contains("push_front")) {
				int data = Integer.parseInt(st.nextToken());
				dq.offerFirst(data);
			}
			else if (order.equals("push_back")) {
				int data = Integer.parseInt(st.nextToken());
				dq.offerLast(data);
			}
			else if (order.equals("pop_front")) {
				if (dq.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.pollFirst() + "\n");
				}
			}
			else if (order.equals("pop_back")) {
				if (dq.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.pollLast() + "\n");
				}
			}
			else if (order.equals("size")) {
				sb.append(dq.size() + "\n");
			}
			else if (order.equals("empty")) {
				if (dq.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			}
			else if (order.equals("front")) {
				if (dq.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.peekFirst() + "\n");
				}
			}
			else if (order.equals("back")) {
				if (dq.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.peekLast() + "\n");
				}
			}
		}
		System.out.println(sb);
	}

}
