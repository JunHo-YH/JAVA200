package chap7_method;

import java.util.Scanner;

public class SumUp1 {
	// 1부터 n까지의 합
	static int sumUp(int n) {
		int sum = 0; // 합계
		for (int i = 1; i <= n; i++) {
			sum += i; // sum에 i를 더한다.
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하가");
		int x;
		do {
			System.out.print("x의 값: ");
			x = scan.nextInt();
		} while (x <= 0);
	
		System.out.print("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
	}
	

}
