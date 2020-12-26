// 입력한 2개의 실숫값의 합과 평균을 표시
package chapter2;
import java.util.Scanner;
public class SumAveDouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값: "); // x값 입력 메세지
		double x = scan.nextDouble(); // 입력한 실숫값을 x에 저장한다.
		
		System.out.println("y값: ");
		double y = scan.nextDouble();
		
		System.out.println("합계는 " + (x + y) + "입니다.");
		System.out.println("평균은 " + (x + y) / 2 + "입니다.");
	}

}
