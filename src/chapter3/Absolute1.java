// �������� �о ������ ǥ��(���1)
package chapter3;
import java.util.Scanner;
public class Absolute1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = scan.nextInt();
		
		if(n >= 0) {
			System.out.println("������ " + n + "�Դϴ�.");
		} else {
			System.out.println("������ " + -n + "�Դϴ�.");
		}
	}

}
