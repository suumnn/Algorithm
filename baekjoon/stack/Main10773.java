import java.util.Scanner;
import java.util.Stack;

public class Main10773 { // Á¦·Î

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		int sum = 0;
		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();

			if (n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
		}
		
		for (Integer i : stack) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
