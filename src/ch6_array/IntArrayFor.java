package ch6_array;

public class IntArrayFor {

	public static void main(String[] args) {
		int[] a = new int[5]; // 배열 선언

// 배열의 각 요소에 5, 4, 3, 2, 1을 대입해서 표시
		for (int i = 0; i < a.length; i++) {
			a[i] = 5 - i;
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}
}
