package ex04;

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

public class Ex6_4 {

	public static void main(String[] args) {

		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
		tvArr[0].color = "blue";
		tvArr[0].power = true;
		tvArr[0].channel = 5;
		
		System.out.println("tvArr ��ü �迭�� �ε��� 0 ��°�� color : " + tvArr[0].color + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 0 ��°�� power : " + tvArr[0].power + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 0 ��°�� channel : " + tvArr[0].channel + " �Դϴ�.");
		
		tvArr[1].color = "orange";
		tvArr[1].power = false;
		tvArr[1].channel = 11;
		
		System.out.println("tvArr ��ü �迭�� �ε��� 1 ��°�� color : " + tvArr[1].color + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 1 ��°�� power : " + tvArr[1].power + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 1 ��°�� channel : " + tvArr[1].channel + " �Դϴ�.");
		
		tvArr[2].color = "cyan";
		tvArr[2].power = false;
		tvArr[2].channel = 17;
		
		System.out.println("tvArr ��ü �迭�� �ε��� 2 ��°�� color : " + tvArr[2].color + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 2 ��°�� power : " + tvArr[2].power + " �Դϴ�.");
		System.out.println("tvArr ��ü �迭�� �ε��� 2 ��°�� channel : " + tvArr[2].channel + " �Դϴ�.");
		
		
		
	}

}
