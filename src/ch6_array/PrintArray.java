package ch6_array;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �߰�: ");
		int n = scan.nextInt();		// ��� �� �Է�
		int[] a = new int[n];		// �迭 ����
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scan.nextInt();
		}
		System.out.print("a = {");
		if (n >= 2)
			for (int i = 0; i < n -1; i++)
				System.out.print(a[i] + ", ");
		if (n >= 1)
			System.out.print(a[n - 1]);	// ������ ��� ǥ��
		System.out.print("}");
	}

}
