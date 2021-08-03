import java.util.Scanner;

public class Main11729 {

	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		hanoi(n, 1, 3, 2);
		
		System.out.println(count);
		System.out.println(sb);

	}
	
	// start: �����, end: ������, mid: ������
	static void hanoi(int n, int start, int end, int mid) {
		if (n == 1) {
			count++;
			sb.append(start + " " + end + "\n");
			return;
		}
		
		count++;
		hanoi(n-1, start, mid, end); // n-1���� �������� �Űܳ���
		sb.append(start + " " + end + "\n"); // ������� �ִ� ���� ū �ָ� �������� �Ű�
		hanoi(n-1, mid, end, start); // �������� �ִ� n-1���� �������� �Ű�
	}

}
