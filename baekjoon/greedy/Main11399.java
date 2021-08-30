import java.util.Arrays;
import java.util.Scanner;

public class Main11399 { // ATM

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] time = new int[n];
		int[] sumOfTime = new int[n]; // ДЉРћЧе
		
		for (int i = 0; i < n; i++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
		
		sumOfTime[0] = time[0];
		for (int i = 1; i < n; i++) {
			sumOfTime[i] = sumOfTime[i - 1] + time[i];
		}
		
		int sum = 0;
		for (int i : sumOfTime) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
