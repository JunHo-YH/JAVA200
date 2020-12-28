// 정숫값을 읽어서 절댓값을 표시(방법1)
package chapter3;
import java.util.Scanner;
public class Absolute1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int n = scan.nextInt();
		
		if(n >= 0) {
			System.out.println("절댓값은 " + n + "입니다.");
		} else {
			System.out.println("절댓값은 " + -n + "입니다.");
		}
	}

}
