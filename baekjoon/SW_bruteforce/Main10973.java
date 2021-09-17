import java.util.Scanner;

public class Main10973 { // 이전 순열 (다음 순열과 다른 방식으로 풀어보기)

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (prevPermutation()) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
		} else {
			System.out.println(-1);
		}

	}

	static boolean prevPermutation() {
		// 뒤에서부터 탐색
		// 1. arr[i-1] > arr[i]를 만족하는 첫 번째 수
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] <= arr[i]) {
			i--;
		}

		// 첫번째 순열인 경우
		if (i <= 0) {
			return false;
		}

		// 2. arr[i-1] > arr[j]를 만족하는 첫 번째 수
		int j = arr.length - 1;
		while (arr[i - 1] <= arr[j]) {
			j--;
		}

		// 3. swap arr[i-1], arr[j]
		swap(i - 1, j);

		// 4. i부터 순열 뒤집기
		int k = arr.length - 1;
		while (i < k) {
			swap(i, k);
			i++;
			k--;
		}
		return true;
	}

	static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
