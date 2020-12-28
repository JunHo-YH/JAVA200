// 정숫값을 읽어서 절댓값 표시(방법2)
package chapter3;

import java.util.Scanner;

public class Absolute2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int n = scan.nextInt();
		int abs;
		
		if(n >= 0) {
			abs = n;
		} else {
			abs = -n;
		}
		System.out.println("절댓값은: " + abs + "입니다.");
	}

}
