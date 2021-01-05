package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("��� ��: ");
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int k;
			do {
				a[i] = 1 + rand.nextInt(42); // 1 ~ 42 ����
				k = 0;
				for (; k < i; k++) {
					if (a[k] == a[i])
						break;
				}
			} while (k < i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

		for (int i = 0; i < a.length - 1; i++) { // ù��° for���� �� ���� �������� ��, �迭�� ���̰� 3�� ��, �� ���� 2�� �����µ�// 2 < 3 - 1�� �����ϴ°�?
			int tmp;
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] < a[k]) {
					tmp = a[i];
					a[i] = a[k];
					a[k] = tmp;
				}
			}
		}
		System.out.println("===========���� ��===========");
		for (int result : a) {
			System.out.print(result + " ");
		}

	}

}
