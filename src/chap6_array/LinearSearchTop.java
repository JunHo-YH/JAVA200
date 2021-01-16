package chap6_array;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int n = scan.nextInt();		// ��� �� �Է�
		int[] a = new int[n];		// �迭 ����

		for (int k = 0; k < n; k++) {
			System.out.print("a[" + k + "]= ");
			a[k] = scan.nextInt();
		}

		System.out.print("ã�� ����: ");
		int key = scan.nextInt();

		int i;
		for (i = 0; i < n; i++) {
			System.out.println(i + "------------");
			if (a[i] == key)
				break; 
		}
		System.out.println(i);

		if (i < n)
			System.out.println("�� ���� a[" + i + "]�� �ֽ��ϴ�.");
		else
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");

	}

}
