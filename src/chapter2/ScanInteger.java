package chapter2;

// Ű���忡�� �Է��� ������ ǥ��
// ���α׷��� ���� �κ�(Ŭ���� ���� ����)�� �ۼ��Ѵ�.
import java.util.Scanner;
public class ScanInteger {

	public static void main(String[] args) {
		// main �޼����� ���� �κ�(���� �Է¹ޱ� ������)�� �ۼ��Ѵ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		// Ű���带 ���� �Է��� �������� �޴´�.
		int x = scan.nextInt();
		System.out.println(x + "�� �Է��߽��ϴ�.");
	}

}
