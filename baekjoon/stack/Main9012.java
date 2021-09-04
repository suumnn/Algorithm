import java.util.Scanner;
import java.util.Stack;

public class Main9012 { // °ýÈ£

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		Stack<Character> stack;

		for (int i = 0; i < t; i++) {
			boolean flag = false;
			stack = new Stack<>();

			String data = sc.next();

			for (int j = 0; j < data.length(); j++) {
				char ch = data.charAt(j);

				if (ch == '(') {
					stack.push(ch);
				} else { // ch == ')'
					if (stack.empty()) {
						System.out.println("NO");
						flag = true;
						break;
					} else { 
						stack.pop();
					}
				}
			}

			if (!flag) {
				if (stack.empty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

	}
}
