package chapter2;

// Ű���忡�� �Է��� �������� ������ �ڸ����� ������ ���� ������ �ڸ����� ǥ��
import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		int x = scan.nextInt(); // �Է¹��� �������� x�� �����Ѵ�.
		
		System.out.println("������ �ڸ����� ������ ���� " + (x / 10) + "�Դϴ�.");
		System.out.println("������ �ڸ����� " + (x % 10) + "�Դϴ�.");
		
	}

}
