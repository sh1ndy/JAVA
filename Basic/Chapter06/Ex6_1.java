
// Tv ��ü ����
class Tv {
	// ��ü�� �Ӽ�
	String color;
	boolean power;
	int channel;
	
	// ��ü�� ���
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}


public class Ex6_1 {

	public static void main(String[] args) {
		
		// Tv�ν��Ͻ��� �����ϱ� ���� �������� ���� �� �ν��Ͻ� ����
		Tv t = new Tv();
		// �������� t�� ����Ű�� Tv�ν��Ͻ��� ä�� �Ӽ� ���
		t.channel = 7;
		// �������� t�� ����Ű�� Tv�ν��Ͻ��� ä�δٿ� ��� ���
		t.channelDown();
		
		System.out.println("���� ä���� " + t.channel + "�� ä���Դϴ�.");
		
	}

}

