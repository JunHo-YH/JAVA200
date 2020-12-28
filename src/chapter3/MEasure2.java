package chapter3;

import java.util.Scanner;

public class MEasure2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("변수 A: ");
		int a = scan.nextInt();
		System.out.print("변수 B: ");
		int b = scan.nextInt();

		if (!(a % b == 0)) {
			System.out.println("B는 A의 약수가 아닙니다.");
		} else {
			System.out.println("B는 A의 약수입니다.");
		}
	}

}
