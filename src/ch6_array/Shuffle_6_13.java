package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class Shuffle_6_13 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		
		for (int i = 0; i < 2 * n; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		
		System.out.println("��Ҹ� �������ϴ�.");
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		
		
		
	}

}
