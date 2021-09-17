import java.util.Scanner;

public class Main10973 { // ���� ���� (���� ������ �ٸ� ������� Ǯ���)

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
		// �ڿ������� Ž��
		// 1. arr[i-1] > arr[i]�� �����ϴ� ù ��° ��
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] <= arr[i]) {
			i--;
		}

		// ù��° ������ ���
		if (i <= 0) {
			return false;
		}

		// 2. arr[i-1] > arr[j]�� �����ϴ� ù ��° ��
		int j = arr.length - 1;
		while (arr[i - 1] <= arr[j]) {
			j--;
		}

		// 3. swap arr[i-1], arr[j]
		swap(i - 1, j);

		// 4. i���� ���� ������
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
