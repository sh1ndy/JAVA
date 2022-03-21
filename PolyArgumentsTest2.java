import java.util.ArrayList;

class Product2 {
	int money;
	int bonusPoint;
	
	Product2(int money) {
		this.money = money;
		bonusPoint = (int) (money / 10.0);
	}
}

class Mouse2 extends Product2 {
	Mouse2() {
		super(100);
	}
	
	public String toString() {
		return "Mouse";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(300);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(200);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint;
	ArrayList item = new ArrayList();
//	Product2[] item = new Product2[10];
	int idx = 0;
	
	void buy(Product2 p) {
		if (money < p.money) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		
		money -= p.money;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for (int i = 0; i < item.size(); i++) {
			if (item.get(i) == null) {
				break;
			}
			
			Product2 p = (Product2) item.get(i);
			sum += p.money;
			itemList += p + ", ";
		}
		
		System.out.println("현재 구매한 제품리스트는 : " + itemList);
		System.out.println("현재까지 사용한 금액은 : " + sum + "만원 입니다.");
	}
	
}

public class PolyArgumentsTest2 {

	public static void main(String[] args) {

		Buyer2 b = new Buyer2();
		b.buy(new Mouse2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		
		System.out.println("현재 남은 금액은 : " + b.money + "만원 입니다.");
		System.out.println("현재 보유중인 점수는 : " + b.bonusPoint + "점 입니다.");
		
		System.out.println();
		b.summary();
		
	}

}
