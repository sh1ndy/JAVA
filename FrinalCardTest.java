
class Card2 {
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڿ��� �ܤ� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Card2(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card2() {
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FrinalCardTest {

	public static void main(String[] args) {
		
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5; // ����! ������ ���ÿ� �ʱ�ȭ �Ǿ���
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
	}

}
