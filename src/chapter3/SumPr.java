package chapter3;

public class SumPr {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 1;
		int total = 0;
		
		for (; true; num++, s = -s) {
			sum = num * s;
			total += sum;
			if (total >= 100) {
				break;
			}
		}
		System.out.println(num);
	}

}
