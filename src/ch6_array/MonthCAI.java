package ch6_array;

import java.util.Scanner;
import java.util.Random;

public class MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] monthString = {
								"January", "Febuary", "March", "April", "May", "June", "July", 
								"August", "September", "October", "November", "December"
		};
		
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		
		int retry; // 다시 한번
		int last = -1; // 이전 월
		
		do {
			int month;	// 표시할 월: 0 ~ 11의 난수
			do {
				month = rand.nextInt(12);
				
			} while (month == last);
			last = month;
			
			while (true) {
				System.out.print((month + 1) + "월");
				String s = scan.next();
				
				if (s.equals(monthString[month])) break; // 정답
				System.out.println("틀렸습니다.");
			
			}
			System.out.print("정답입니다. 다시 한번? 1...Yes / 0...No: ");
			retry = scan.nextInt();
		}while (retry == 1);
		
		
		
	}

}
