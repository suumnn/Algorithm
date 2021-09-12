import java.util.LinkedList;
import java.util.Scanner;

public class Main1021 { // 회전하는 큐

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> dq = new LinkedList<>();

		int n = sc.nextInt(); // 큐의 크기
		int m = sc.nextInt(); // 뽑아내려고 하는 수의 개수
		int[] nums = new int[m]; // 뽑아내려고 하는 수의 위치

		for (int i = 0; i < m; i++) {
			nums[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			dq.offer(i);
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			while (true) {
				if (dq.peekFirst() == nums[i]) {
					dq.pollFirst();
					break;
				} else {// 뽑아내려는 수의 인덱스가 절반보다 앞인지
					if (dq.indexOf(nums[i]) <= dq.size() / 2) {
						dq.offer(dq.pollFirst());
						count++;
					} else { // 뒤인지
						dq.offerFirst(dq.pollLast());
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
