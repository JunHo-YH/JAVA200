package chapter3;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = scan.nextInt();
		
		if(n > 0)
		{
			System.out.println("����Դϴ�.");
		}
		else if(n < 0)
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("0�Դϴ�.");
		}
	}

}
