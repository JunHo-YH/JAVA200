// Ű���带 ���� �Է¹��� ���� +-5 ������ �ִ� ���� ����

package chapter2;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("������: ");
		int x = scan.nextInt();

		System.out.println("�Է� ���� +-5 ������ ������ �����߽��ϴ�");
		System.out.println("���� " + (x - 5 + rand.nextInt(11)) + "�Դϴ�.");
	}

}
