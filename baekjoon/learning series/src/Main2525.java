import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // ��
		int b = sc.nextInt(); // ��
		int c = sc.nextInt(); // �丮 �ð�
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
