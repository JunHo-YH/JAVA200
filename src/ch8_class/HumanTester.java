package ch8_class;

import chapter6.SutdaCard;

// 사람 클래스
class Human {
	private String name;
	private int height;
	private int weight;
	
	// 생성자
	Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}
	
	// 가져오기
	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gainWeight(int w) {weight += w;} // 살이 찐다.
	void reduceWeight(int w) {weight -= w;} //살이 빠진다.
}


public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
//		gildong.name = "길동";
//		gildong.height = 170;
//		gildong.weight = 60;
//		
//		chulsu.name = "철수";
//		chulsu.height = 166;
//		chulsu.weight = 72;
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("키:" + gildong.getHeight() + "cm");
		gildong.gainWeight(50);
		System.out.println("체중:" + gildong.getWeight() + "kg");
		System.out.println();
		System.out.println("이름:" + chulsu.getName());
		System.out.println("키:" + chulsu.getHeight() + "cm");
		System.out.println("체중:" + chulsu.getWeight() + "kg");
	}

}
