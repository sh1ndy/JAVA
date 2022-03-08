class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2 {
	Audio() {
		super(150);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];

	int i = 0;

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;

		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void showProdictList() {
		int sum = 0;
		String cartList = "";

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			}
			sum += cart[i].price;
			cartList += cart[i] + ", ";
		}
		System.out.println("�����Ͻ� �� �ݾ��� " + sum + "�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + cartList + " �Դϴ�.");

	}
}

public class Ex7_9 {

	public static void main(String[] args) {

		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());

		b.showProdictList();

	}

}
