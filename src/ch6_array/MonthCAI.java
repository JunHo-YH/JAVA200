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
		
		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�.");
		System.out.println("ù ���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");
		
		int retry; // �ٽ� �ѹ�
		int last = -1; // ���� ��
		
		do {
			int month;	// ǥ���� ��: 0 ~ 11�� ����
			do {
				month = rand.nextInt(12);
				
			} while (month == last);
			last = month;
			
			while (true) {
				System.out.print((month + 1) + "��");
				String s = scan.next();
				
				if (s.equals(monthString[month])) break; // ����
				System.out.println("Ʋ�Ƚ��ϴ�.");
			
			}
			System.out.print("�����Դϴ�. �ٽ� �ѹ�? 1...Yes / 0...No: ");
			retry = scan.nextInt();
		}while (retry == 1);
		
		
		
	}

}
