package chapter2;

public class SumAve3A {

	public static void main(String[] args) {
		int x, y, z;
		
		x = 63;
		y = 18;
		z = 52;
		int sum = x + y + z;
		System.out.println("x���� : " + x + "�Դϴ�.");
		System.out.println("y���� : " + y + "�Դϴ�.");
		System.out.println("z���� : " + z + "�Դϴ�.");
		System.out.println("�հ�� : " + sum + "�Դϴ�.");
		System.out.printf("����� %.2f�Դϴ�.	" , sum / 3.0);
	}

}
