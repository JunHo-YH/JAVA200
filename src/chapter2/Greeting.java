// 입력한 성과 이름을 인사
package chapter2;
import java.util.Scanner;
public class Greeting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성: "); String lastName = scan.next(); // 성
		System.out.print("이름: "); String firstName = scan.next();	//이름
		System.out.println("안녕하세요 " + lastName + firstName + "씨");
	}

}
