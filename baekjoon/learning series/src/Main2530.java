import java.util.Scanner;

public class Main2530 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 시
		int b = sc.nextInt(); // 분
		int c = sc.nextInt(); // 초
		int d = sc.nextInt(); // 요리 시간
		c += d;
		
		while (c > 59) {
			b++;
			c -= 60;
		}
		
		while (b > 59) {
			a++;
			b -= 60;
		}
		
		while (a > 23) {
			a -= 24;
		}
		System.out.printf("%d %d %d", a, b, c);
	}

}
