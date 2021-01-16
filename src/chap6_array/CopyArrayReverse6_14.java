package chap6_array;

import java.util.Scanner;

public class CopyArrayReverse6_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 개의 배열을 생성? ");
		int n = scan.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr1[" + i + "] = ");
			arr1[i] = scan.nextInt();
		}
		
		for (int k = 0; k < arr1.length; k++) {
			arr2[k] = arr1[n-1-k];
		}
		
	
		System.out.println("====================");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
	}

}
