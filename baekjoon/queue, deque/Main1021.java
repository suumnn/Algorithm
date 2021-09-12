import java.util.LinkedList;
import java.util.Scanner;

public class Main1021 { // ȸ���ϴ� ť

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> dq = new LinkedList<>();

		int n = sc.nextInt(); // ť�� ũ��
		int m = sc.nextInt(); // �̾Ƴ����� �ϴ� ���� ����
		int[] nums = new int[m]; // �̾Ƴ����� �ϴ� ���� ��ġ

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
				} else {// �̾Ƴ����� ���� �ε����� ���ݺ��� ������
					if (dq.indexOf(nums[i]) <= dq.size() / 2) {
						dq.offer(dq.pollFirst());
						count++;
					} else { // ������
						dq.offerFirst(dq.pollLast());
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
