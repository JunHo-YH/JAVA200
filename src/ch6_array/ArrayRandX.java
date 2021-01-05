package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandX {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		a[0] = 1 + rand.nextInt(10);
		for (int i = 1; i < n; i++) {
			do {
				a[i] = 1 + rand.nextInt(10);
			} while (a[i] == a[i - 1]);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
