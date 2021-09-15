import java.util.Scanner;

public class Main1476 { // 날짜 계산

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int E = sc.nextInt(); // <= 15
		int S = sc.nextInt(); // <= 28
		int M = sc.nextInt(); // <= 19

		int e = 1, s = 1, m = 1;
		int cnt = 1;

		while (true) {
			if (e == E && s == S && m == M) {
				System.out.println(cnt);
				break;
			}

			e++;
			s++;
			m++;
			cnt++;

			if (e > 15) {
				e = 1;
			}
			if (s > 28) {
				s = 1;
			}
			if (m > 19) {
				m = 1;
			}
		}
	}

}
