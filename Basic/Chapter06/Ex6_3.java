
class Card {
	// IV : �ν��Ͻ� ���� �� ��� ����
	String kind;
	int number;
	
	// CV - �޸𸮿� �ö󰡸� ��� ���� (�ν��Ͻ� ���� ���� ��� ����)
	static int width = 100;
	static int height = 250;
}

public class Ex6_3 {

	public static void main(String[] args) {
		
		// static ������ ��ü ���� ���� ��� ����
		System.out.printf("Card.width = %d, Card.height = %d%n", Card.width, Card.height);
		
		// �������� c1�� ����� ���ο� ī�� ��ü���� �� c1�� ��ü�ּҸ� ����Ų��.
		Card c1 = new Card();
		c1.kind = "Heart"; // c1 card��ü�� �Ӽ� ���
		c1.number = 7; // c1 card��ü�� �Ӽ� ���
		
		// �������� c2�� ����� ���ο� ī�� ��ü���� �� c2�� ��ü�ּҸ� ����Ų��.
		Card c2 = new Card();
		c2.kind = "Spade";  // c2 card��ü�� �Ӽ� ���
		c2.number = 5;  // c2 card��ü�� �Ӽ� ���
		
		System.out.println("c1�� ����� " + c1.kind + "�̸�, ��ȣ�� " + c1.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");
		System.out.println("c2�� ����� " + c2.kind + "�̸�, ��ȣ�� " + c2.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");
		
		// c1�� ���μ��� ���� ���� (80, 200)
		c1.width = 80;
		c1.height = 200;
		// c1 ���� ���θ� �����ϴ��� static ������ ��� ��� ��ü�� ���� ���� ���� ����ȴ�.
		// ���������� ����ϴ°� ���� Ŭ���� ������ �����̶����� �����ִ°��� ����.
		System.out.println();
		System.out.println("c1�� ���� ���� ���� ��");
		System.out.println("c1�� ����� " + c1.kind + "�̸�, ��ȣ�� " + c1.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");
		System.out.println("c2�� ����� " + c2.kind + "�̸�, ��ȣ�� " + c2.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");
		
		// ī���� ���̰� �ٽ� ���� ���� �Ǿ����ϴ�.
		System.out.println();
		Card.width = 100;
		Card.height = 250;
		System.out.println("ī�� ���� ���� ���� ��");
		System.out.println("c1�� ����� " + c1.kind + "�̸�, ��ȣ�� " + c1.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");
		System.out.println("c2�� ����� " + c2.kind + "�̸�, ��ȣ�� " + c2.kind + "�̰�, (���α��� : " + Card.width + ", ���α��� : " + Card.height + ") �Դϴ�.");

		
		
	}

}
