package ch8_class;

import chapter6.SutdaCard;

// ��� Ŭ����
class Human {
	private String name;
	private int height;
	private int weight;
	
	// ������
	Human(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}
	
	// ��������
	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gainWeight(int w) {weight += w;} // ���� ���.
	void reduceWeight(int w) {weight -= w;} //���� ������.
}


public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human("�浿", 170, 60);
		Human chulsu = new Human("ö��", 166, 72);
		
//		gildong.name = "�浿";
//		gildong.height = 170;
//		gildong.weight = 60;
//		
//		chulsu.name = "ö��";
//		chulsu.height = 166;
//		chulsu.weight = 72;
		
		System.out.println("�̸�:" + gildong.getName());
		System.out.println("Ű:" + gildong.getHeight() + "cm");
		gildong.gainWeight(50);
		System.out.println("ü��:" + gildong.getWeight() + "kg");
		System.out.println();
		System.out.println("�̸�:" + chulsu.getName());
		System.out.println("Ű:" + chulsu.getHeight() + "cm");
		System.out.println("ü��:" + chulsu.getWeight() + "kg");
	}

}
