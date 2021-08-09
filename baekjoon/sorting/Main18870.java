import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main18870 { // ÁÂÇ¥ ¾ĞÃà

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] res = arr.clone();

		Arrays.sort(arr);

		int count = 0;
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!hs.containsKey(arr[i])) {
				hs.put(arr[i], count++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(hs.get(res[i]) + " ");
		}
		System.out.println(sb);
	}
}
