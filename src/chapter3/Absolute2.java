// �������� �о ���� ǥ��(���2)
package chapter3;

import java.util.Scanner;

public class Absolute2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = scan.nextInt();
		int abs;
		
		if(n >= 0) {
			abs = n;
		} else {
			abs = -n;
		}
		System.out.println("������: " + abs + "�Դϴ�.");
	}

}
