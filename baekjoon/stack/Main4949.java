import java.util.Scanner;
import java.util.Stack;

public class Main4949 { // ±ÕÇüÀâÈù ¼¼»ó

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> stack;

		while (true) {
			String str = sc.nextLine();
			boolean flag = false;

			if (str.equals(".")) {
				break;
			}

			stack = new Stack<>();

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(' || ch == '[') {
					stack.push(ch);
				} else if (ch == ')') {
					if (stack.empty() || stack.peek() != '(') {
						flag = true;
						break;
					} else {
						stack.pop();
					}

				} else if (ch == ']') {
					if (stack.empty() || stack.peek() != '[') {
						flag = true;
						break;
					} else {
						stack.pop();
					}	
				}
			}

			if (stack.empty() && flag == false) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}
