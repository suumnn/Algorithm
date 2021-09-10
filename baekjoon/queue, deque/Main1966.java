import java.util.LinkedList;
import java.util.Scanner;

public class Main1966 { // 프린터 큐

	static LinkedList<Document> dq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // 문서의 개수
			int target = sc.nextInt(); // m: 찾는 문서가 현재 몇번째에?

			dq = new LinkedList<>();

			for (int j = 0; j < n; j++) {
				dq.offer(new Document(j, sc.nextInt()));
			}

			int count = 0;
			while (true) {
				int max = findMax();
				if (dq.peekFirst().priority == max) { // 첫번째 값이 최대값이라면
					count ++;

					if (dq.peekFirst().idx == target) { // 첫번째 값이 최대값이고 타깃이라면
						System.out.println(count);
						break;
					} else {
						dq.pollFirst();
					}
				} else {
					dq.offer(dq.pollFirst());
				}
			}
		}
	}

	static int findMax() {
		int max = -1;
		for (int i = 0; i < dq.size(); i++) {
			if (max < dq.get(i).priority) {
				max = dq.get(i).priority;
			}
		}
		return max;
	}

}

class Document {
	int idx;
	int priority;

	public Document(int idx, int priority) {
		super();
		this.idx = idx;
		this.priority = priority;
	}

}