class Product {
	int price;				// ��ǰ�� ����
	int bonusPoint; 		// ��ǰ���� �� �����ϴ� ���ʽ� ����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // ���ʽ� ������ ��ǰ������ 10%
	}
}

class Mouse extends Product {
	Mouse() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);
	}
	
	public String toString() {
		return "Mouse";
	}
}

class Computer extends Product {
	Computer() {
		super(300);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("���� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
}

public class PolyArgumentsTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Mouse());
		
		System.out.println("���� ���� �ݾ��� " + b.money);
		System.out.println("���� �������� ������ " + b.bonusPoint);
		
	}

}
