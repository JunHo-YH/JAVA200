package chap6_array;

public class DoubleArrayFor {

	public static void main(String[] args) {
		double[] d = new double[5];	//배열 선언
		
		for (int i = 0; i < d.length; i++) {
			d[i] = (i + 1) * 1.1;
			System.out.println("d[" + i + "] = " + d[i]);
		}
	}

}
