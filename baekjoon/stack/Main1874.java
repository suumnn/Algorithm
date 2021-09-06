import java.util.Scanner;
import java.util.Stack;

public class Main1874 { // 스택 수열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();
		int now = 0;

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();

			if (data > now) {
				for (int j = now + 1; j <= data; j++) {
					stack.push(j);
					sb.append("+" + "\n");
				}
				now = data;
			} else if (stack.peek() != data) {
				System.out.println("NO");
				return;
			}

			stack.pop();
			sb.append("-" + "\n");
		}
		System.out.println(sb);
	}

}
