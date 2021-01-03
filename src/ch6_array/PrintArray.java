package ch6_array;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 추가: ");
		int n = scan.nextInt();		// 요소 수 입력
		int[] a = new int[n];		// 배열 생성
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scan.nextInt();
		}
		System.out.print("a = {");
		if (n >= 2)
			for (int i = 0; i < n -1; i++)
				System.out.print(a[i] + ", ");
		if (n >= 1)
			System.out.print(a[n - 1]);	// 마지막 요소 표시
		System.out.print("}");
	}

}
