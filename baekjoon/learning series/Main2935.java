import java.math.BigInteger;
import java.util.Scanner;

public class Main2935 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.nextLine());
		char oper = sc.nextLine().charAt(0);
		BigInteger b = new BigInteger(sc.nextLine());
		
		if (oper == '+')
			System.out.println(a.add(b));
		else if (oper == '*')
			System.out.println(a.multiply(b));
	}
}
