package ch6_array;

import java.util.Scanner;

public class ArraySumAve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��� ��: ");
		
		int n = scan.nextInt();	// ��� �� �Է�
		double[] a = new double[n];	// �迭 ����
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0;	//�հ�
		for (double i : a)
			sum += i;
		
		System.out.println("��� ����� ����: " + sum + "�Դϴ�.");
		System.out.println("��� ����� ����� " + sum / n + "�Դϴ�."); 
		
	}

}
