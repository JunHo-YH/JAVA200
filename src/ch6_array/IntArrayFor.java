package ch6_array;

public class IntArrayFor {

	public static void main(String[] args) {
		int[] a = new int[5]; // �迭 ����

// �迭�� �� ��ҿ� 5, 4, 3, 2, 1�� �����ؼ� ǥ��
		for (int i = 0; i < a.length; i++) {
			a[i] = 5 - i;
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}
}
