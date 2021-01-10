package chap7_method;

import java.util.Scanner;

public class PrintSeason {
	
	static void printSeason(int m) {
		switch (m) {
		case 3: case 4: case 5: System.out.print("��"); break;
		case 6: case 7: case 8: System.out.print("����"); break;
		case 9: case 10: case 11: System.out.print("����"); break;
		case 1: case 2: case 12: System.out.print("�ܿ�"); break;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("�� ���Դϱ�?(1 ~ 12): ");
			month = scan.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.print("�ش� ���� ������ ");
		printSeason(month);
		System.out.print("�Դϴ�.");
	
	
	}

}
