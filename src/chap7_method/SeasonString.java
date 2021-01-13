package chap7_method;

import java.util.Scanner;

public class SeasonString {
	// m���� ������ ǥ��
	static String seasonOf(int m) {
		switch(m) {
			case 3: case 4: case 5: return "��"; 
			case 6: case 7: case 8: return "����"; 
			case 9: case 10: case 11: return "����"; 
			case 1: case 2: case 12: return "�ܿ�"; 
		}
		return ""; // m�� 1~12�� �ƴϸ� ���� ���ڿ��� ��ȯ
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("�� ���Դϱ�?(1 ~ 12) ");
			month = scan.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.print("�ش� ���� ������ " + seasonOf(month) + "�Դϴ�.");
		
		
	}

}
