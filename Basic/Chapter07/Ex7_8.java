package ex08;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint;

	void buy(Product p) {
		// 가진 돈이 제품가격보다 적으면 구매를 못하는 조건
		if (money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}

		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구매하셨습니다.");

	}

}

public class Ex7_8 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println("현재 남은 금액: " + b.money);
		System.out.println("현재 보유한 포인트: " + b.bonusPoint);

	}

}
