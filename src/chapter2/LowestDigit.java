package chapter2;

// 키보드에서 입력한 정수값이 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		int x = scan.nextInt(); // 입력받은 정숫값을 x에 저장한다.
		
		System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다.");
		System.out.println("마지막 자릿수는 " + (x % 10) + "입니다.");
		
	}

}
