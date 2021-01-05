package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int n;
		do {
			System.out.print("요소 수: ");
			n = scan.nextInt();
		} while (n > 10); // 요소수가 10 초과하면 다시 입력하도록 만든다.

		int[] a = new int[n]; // 배열 생성

		for (int i = 0; i < n; i++) {
			int k;
			do {
				k = 0;
				a[i] = 1 + rand.nextInt(10);
				for (; k < i; k++) {
					if (a[k] == a[i])
						break; // 감싸고 있는 for문 빠져나가기
				}
			} while (k < i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
