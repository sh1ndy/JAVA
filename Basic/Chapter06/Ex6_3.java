package ex03;

class Tv {
	// Tv�� �Ӽ�(��� ����)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	// Tv�� ���(�޼���)
	void power() {
		// Tv�� �Ѱų� ���� ����� �ϴ� �޼���
		power = !power;
	}
	
	void channelUp() {
		// Tv�� ä���� ���̴� ����� �ϴ� �޼���
		++channel;
	}
	
	void channelDown() {
		// Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
	
}

public class Ex6_3 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t1.color = "red";
		t1.power = false;
		t1.channel = 4;
		
		System.out.println("t1�� color : " + t1.color + " �Դϴ�.");
		System.out.println("t1�� power : " + t1.power + " �Դϴ�.");
		System.out.println("t1�� channel :" + t1.channel + " �Դϴ�.");
		
		t2.color = "yellow";
		t2.power = true;
		t2.channel = 5;
		
		System.out.println("t2�� color : " + t2.color + " �Դϴ�.");
		System.out.println("t2�� power : " + t2.power + " �Դϴ�.");
		System.out.println("t2�� channel :" + t2.channel + " �Դϴ�.");
		
		t2.color = "green";
		t2.power = true;
		t2.channel = 11;
		
		System.out.println("t3�� color : " + t3.color + " �Դϴ�.");
		System.out.println("t3�� power : " + t3.power + " �Դϴ�.");
		System.out.println("t3�� channel :" + t3.channel + " �Դϴ�.");
		
		
		
	}

}
