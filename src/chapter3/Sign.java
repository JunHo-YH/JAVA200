package chapter3;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int n = scan.nextInt();
		
		if(n > 0)
		{
			System.out.println("양수입니다.");
		}
		else if(n < 0)
		{
			System.out.println("음수입니다.");
		}
		else
		{
			System.out.println("0입니다.");
		}
	}

}
