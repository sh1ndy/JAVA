package practice;

import java.util.Vector;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(300);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(200);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 3000;
	int bonusPoint;
	Vector item = new Vector();
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("���� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
	void summary() {
		if (item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		String cartList = "";
		int sum = 0;
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i); // get ��ȯŸ���� Object�̹Ƿ� Product�� ����ȯ ���ش�.
			cartList += p + ", ";
			sum += p.price;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� : " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� : " + cartList + "�Դϴ�.");
	}
}

public class PolyArgumentsTest3 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
