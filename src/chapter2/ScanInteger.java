package chapter2;

// 키보드에서 입력한 정숫값 표시
// 프로그램의 시작 부분(클래스 선언 이전)에 작성한다.
import java.util.Scanner;
public class ScanInteger {

	public static void main(String[] args) {
		// main 메서드의 시작 부분(값을 입력받기 이전에)에 작성한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정숫값: ");
		// 키보드를 통해 입력한 정숫값을 받는다.
		int x = scan.nextInt();
		System.out.println(x + "를 입력했습니다.");
	}

}
