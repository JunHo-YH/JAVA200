package ch6_array;

import java.util.Scanner;

public class CopyArrayReverse6_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ��:");
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arr1[i] = scan.nextInt();
		}
		
		// �迭 arr1�� ��� ��Ҹ� �������� �迭 arr2�� ����
		for (int i = 0; i < n; i++) {
			arr2[i] = arr1[n - i - 1];
		}
		
		System.out.println("arr1�� ��� ��Ҹ� �������� �����߽��ϴ�.");
		
		for (int i = 0; i < n; i++) {
			System.out.println("b[" + i + "] = " + arr1[i]);
		}
		
		
	}

}
