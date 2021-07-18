import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 시
		int b = sc.nextInt(); // 분
		int c = sc.nextInt(); // 요리 시간
		b += c;
		
		while (b > 59) {
			a++;
			b -= 60;
		}
		
		while (a > 23) {
			a -= 24;
		}
		System.out.println(a + " " + b);
	}

}
