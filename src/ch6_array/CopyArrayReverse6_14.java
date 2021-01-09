package ch6_array;

import java.util.Scanner;

public class CopyArrayReverse6_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arr1[i] = scan.nextInt();
		}
		
		// 배열 arr1의 모든 요소를 역순으로 배열 arr2에 복사
		for (int i = 0; i < n; i++) {
			arr2[i] = arr1[n - i - 1];
		}
		
		System.out.println("arr1의 모든 요소를 역순으로 복사했습니다.");
		
		for (int i = 0; i < n; i++) {
			System.out.println("b[" + i + "] = " + arr1[i]);
		}
		
		
	}

}
