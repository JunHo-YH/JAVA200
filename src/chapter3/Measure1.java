// ���������� ������� �ĺ�(� ������)
package chapter3;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� A: "); int a = scan.nextInt();
		System.out.print("���� B: "); int b = scan.nextInt();
		
		if(a % b == 0) {
			System.out.println("B�� A�� ����Դϴ�.");
		}else {
			System.out.println("B�� A�� ����� �ƴմϴ�.");
		}
	}

}
