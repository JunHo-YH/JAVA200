package chap7_method;

import java.util.Scanner;

public class MIn3 {
	// a,b,c�� �ּڰ� ��ȯ
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� a: "); int a = scan.nextInt();
		System.out.print("���� b: "); int b = scan.nextInt();
		System.out.print("���� c: "); int c = scan.nextInt();
		
		System.out.println("�ּڰ��� " + min(a, b, c) + "�Դϴ�.");
		
		
	}

}
