import java.util.Scanner;

public class Main1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long sum = 0;
		int cnt = 1;
		
		while (true) {
			if (sum > s) {
				cnt--;
				break;
			}	
			sum += cnt;
			cnt++;
		}
		System.out.println(cnt - 1);
	}
}
