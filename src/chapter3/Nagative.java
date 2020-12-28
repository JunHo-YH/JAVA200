// 읽은 정숫값이 음의 값인가?
package chapter3;
import java.util.Scanner;
public class Nagative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int n = scan.nextInt();
		
		if(n < 0) {
			System.out.println("이 값은 음의 값입니다.");
		} else if(n > 0) {
			System.out.println("양의 값입니다.");
		} else {
			System.out.println("이 값은 0입니다.");
		}
	}

}
