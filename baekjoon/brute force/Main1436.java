import java.util.Scanner;

public class Main1436 {

	public static void main(String[] args) { // ��ȭ���� ��
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 666; // ���� ����
		int count = 1;
		
		while (count < n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
