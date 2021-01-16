package chap9_class;

import java.util.Scanner;

public class CoordinateTester1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÁÂÇ¥ p¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		System.out.print("XÁÂÇ¥: "); double x = scan.nextDouble();
		System.out.print("YÁÂÇ¥: "); double y = scan.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		Coordinate q = p;
		q.set(9.9, 9.9);
		
		System.out.println("p = (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("p = (" + q.getX() + ", " + q.getY() + ")");
		
		
	}

}
