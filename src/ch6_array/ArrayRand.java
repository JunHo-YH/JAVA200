package ch6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("요소 수: ");
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int k;
			do {
				a[i] = 1 + rand.nextInt(42); // 1 ~ 42 난수
				k = 0;
				for (; k < i; k++) {
					if (a[k] == a[i])
						break;
				}
			} while (k < i);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

		for (int i = 0; i < a.length - 1; i++) { // 첫번째 for문을 줄 수로 생각했을 때, 배열의 길이가 3일 때, 줄 수는 2가 나오는데// 2 < 3 - 1이 성립하는가?
			int tmp;
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] < a[k]) {
					tmp = a[i];
					a[i] = a[k];
					a[k] = tmp;
				}
			}
		}
		System.out.println("===========정렬 후===========");
		for (int result : a) {
			System.out.print(result + " ");
		}

	}

}
