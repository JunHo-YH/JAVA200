// �Է��� 2���� �Ǽ����� �հ� ����� ǥ��
package chapter2;
import java.util.Scanner;
public class SumAveDouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x��: "); // x�� �Է� �޼���
		double x = scan.nextDouble(); // �Է��� �Ǽ����� x�� �����Ѵ�.
		
		System.out.println("y��: ");
		double y = scan.nextDouble();
		
		System.out.println("�հ�� " + (x + y) + "�Դϴ�.");
		System.out.println("����� " + (x + y) / 2 + "�Դϴ�.");
	}

}
