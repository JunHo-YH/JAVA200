package chapter2;

import java.util.Scanner;
public class PlusMinus10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		int x = scan.nextInt(); // x�� �Է¹��� �������� �����Ѵ�.
		
		System.out.printf("10�� ���� ���� %d�Դϴ�,\n", x+10);
		System.out.printf("10�� �� ���� %d�Դϴ�.", x-10);
		// �ܵ� �� �ɱ�� ���� ��ġ�� ��
	}

}
