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
	
	// start: 출발지, end: 목적지, mid: 경유지
	static void hanoi(int n, int start, int end, int mid) {
		if (n == 1) {
			count++;
			sb.append(start + " " + end + "\n");
			return;
		}
		
		count++;
		hanoi(n-1, start, mid, end); // n-1개를 경유지에 옮겨놓음
		sb.append(start + " " + end + "\n"); // 출발지에 있는 가장 큰 애를 목적지로 옮겨
		hanoi(n-1, mid, end, start); // 경유지에 있던 n-1개를 목적지로 옮겨
	}

}
