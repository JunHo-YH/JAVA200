package chapter2;

import java.util.Scanner;
public class PlusMinus10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int x = scan.nextInt(); // x에 입력받은 정숫값을 저장한다.
		
		System.out.printf("10을 더한 값은 %d입니다,\n", x+10);
		System.out.printf("10을 뺀 값은 %d입니다.", x-10);
		// 잔디가 안 심기는 현상 고치는 중
	}

}
