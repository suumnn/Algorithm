import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main18258 { // ť2

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		Deque<Integer> queue = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			if (order.contains("push")) {
				int data = Integer.parseInt(st.nextToken());
				queue.offer(data);
			}
			else if (order.equals("pop")) {
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.poll() + "\n");
				}
			}
			else if (order.equals("size")) {
				sb.append(queue.size() + "\n");
			}
			else if (order.equals("empty")) {
				if (queue.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			}
			else if (order.equals("front")) {
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peek() + "\n");
				}
			}
			else if (order.equals("back")) {
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peekLast() + "\n");
				}
			}
		}
		System.out.println(sb);
	}

}
