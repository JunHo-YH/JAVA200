package chap7_method;

import java.util.Scanner;

public class Med3 {
	// a, b, c�� �߰��� ��ȯ
	static int med(int a, int b, int c) {
		if (a >= b) {
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		}
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� a: ");
		int a = scan.nextInt();
		System.out.print("���� b: ");
		int b = scan.nextInt();
		System.out.print("���� c: ");
		int c = scan.nextInt();

		System.out.println("�߰����� " + med(a, b, c) + "�Դϴ�.");
	}

}
