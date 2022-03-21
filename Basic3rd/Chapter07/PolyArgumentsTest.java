class Product {
	int price;				// 제품의 가격
	int bonusPoint; 		// 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가격의 10%
	}
}

class Mouse extends Product {
	Mouse() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
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
			System.out.println("돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
}

public class PolyArgumentsTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Mouse());
		
		System.out.println("현재 남은 금액은 " + b.money);
		System.out.println("현재 보유중인 점수는 " + b.bonusPoint);
		
	}

}
