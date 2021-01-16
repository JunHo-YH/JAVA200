package chap6_array;

import java.util.Scanner;

public class LinearSearchTop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = scan.nextInt();		// 요소 수 입력
		int[] a = new int[n];		// 배열 생성

		for (int k = 0; k < n; k++) {
			System.out.print("a[" + k + "]= ");
			a[k] = scan.nextInt();
		}

		System.out.print("찾을 숫자: ");
		int key = scan.nextInt();

		int i;
		for (i = 0; i < n; i++) {
			System.out.println(i + "------------");
			if (a[i] == key)
				break; 
		}
		System.out.println(i);

		if (i < n)
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");

	}

}
