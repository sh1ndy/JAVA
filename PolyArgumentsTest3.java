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
			System.out.println("돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품은 존재하지 않습니다.");
		}
	}
	
	void summary() {
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		String cartList = "";
		int sum = 0;
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i); // get 반환타입은 Object이므로 Product로 형변환 해준다.
			cartList += p + ", ";
			sum += p.price;
		}
		
		System.out.println("구입하신 물품의 총금액은 : " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 : " + cartList + "입니다.");
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
