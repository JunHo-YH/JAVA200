// �Է��� ���� �̸��� �λ�
package chapter2;
import java.util.Scanner;
public class Greeting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��: "); String lastName = scan.next(); // ��
		System.out.print("�̸�: "); String firstName = scan.next();	//�̸�
		System.out.println("�ȳ��ϼ��� " + lastName + firstName + "��");
	}

}
