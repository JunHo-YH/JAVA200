package chap7_method;

import java.util.Scanner;

public class SumUp1 {
	// 1���� n������ ��
	static int sumUp(int n) {
		int sum = 0; // �հ�
		for (int i = 1; i <= n; i++) {
			sum += i; // sum�� i�� ���Ѵ�.
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� x������ ���� ���ϰ�");
		int x;
		do {
			System.out.print("x�� ��: ");
			x = scan.nextInt();
		} while (x <= 0);
	
		System.out.print("1���� " + x + "������ ���� " + sumUp(x) + "�Դϴ�.");
	}
	

}
