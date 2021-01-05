package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int n;
		do {
			System.out.print("��� ��: ");
			n = scan.nextInt();
		} while (n > 10); // ��Ҽ��� 10 �ʰ��ϸ� �ٽ� �Է��ϵ��� �����.

		int[] a = new int[n]; // �迭 ����

		for (int i = 0; i < n; i++) {
			int k;
			do {
				k = 0;
				a[i] = 1 + rand.nextInt(10);
				for (; k < i; k++) {
					if (a[k] == a[i])
						break; // ���ΰ� �ִ� for�� ����������
				}
			} while (k < i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
