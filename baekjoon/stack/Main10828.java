import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main10828 { // Ω∫≈√

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();			

			if (order.contains("push")) {
				int data = Integer.parseInt(st.nextToken());
				stack.push(data);
			} 
			else if (order.equals("pop")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			}
			else if (order.equals("size")) {
				System.out.println(stack.size());
			}
			else if (order.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			else if (order.equals("top")) {
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			}
		}
	}

}
