import java.util.Scanner;

public class Main10972 { // ���� ����

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (nextPermutation()) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
		} else {
			System.out.println(-1);
		}
	}

	static boolean nextPermutation() {
		// �迭�� �� �κк��� ã��
		// 1. arr[i-1] < arr[i] �� �����ϴ� ù ���� i
		// 2. j���� i <= j�̰�, arr[i-1] < arr[j] �� �����ϴ� ù ��° ��
		// 3. swap(arr[i-1], arr[j])
		// 4. i���� ���� ������
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				for (int j = n - 1; j >= i; j--) {
					if (arr[i - 1] < arr[j]) {
						swap(i - 1, j);

						int k = n - 1;
						while (i < k) {
							swap(i, k);
							i++;
							k--;
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}

