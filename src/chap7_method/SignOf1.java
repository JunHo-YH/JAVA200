package chap7_method;

import java.util.Scanner;

public class SignOf1 {
	// n의 부호 판정
	static int signOf(int n) {
		int sign = 0;

		if (n > 0)
			sign = 1;
		else if (n < 0)
			sign = -1;

		return sign; // sign 값 반환
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 x: ");
		int x = scan.nextInt();

		System.out.println("signOf(x)는 " + signOf(x) + "입니다.");
	}

}
