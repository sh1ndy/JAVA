package ex06;

class Card {
	static int width = 150;
	static int height = 200;
	
	String kind;
	int number;
}

public class Ex6_6 {

	public static void main(String[] args) {
		
		// CV : ��ü ���� ���� �ٷ� ��� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		// IV : ��ü�� �����ؾ����� ��� ����
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 8;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ") �Դϴ�.");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ") �Դϴ�.");
		System.out.println("ī���� ũ�� ���� ���̰� �����Ǿ����ϴ�.");
		
		// cv(����, ����)�� ��� �տ� ��ü�� �̸����� ����ϴ� ���� Best
		Card.width = 100;
		Card.height = 170;
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ") �Դϴ�.");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + Card.width + ", " + Card.height + ") �Դϴ�.");
		
	}

}
