package ch24;

import java.util.ArrayList;

public class Customer {
	
	private int customerNum;
	private int money;
	private ArrayList<Coffee> coffeeList;
	
	Customer() {
		
	}
	
	Customer(int customerNum, int money) {
		this.customerNum = customerNum;
		this.money = money;
		
		coffeeList = new ArrayList<>();	
	}
	
	public void orderCoffe(String name, int price, int count) {
		Coffee coffee = new Coffee();
		coffee.setCoffeeName(name);
		coffee.setPrice(price * count);
		coffeeList.add(coffee);
		money -= coffee.getPrice();
	}
	
	public void orderShowInfo() {
		int totalPrice = 0;
		
		for (int i = 0; i < coffeeList.size(); i++) {
			totalPrice += coffeeList.get(i).getPrice();
			System.out.println("대기번호 " + customerNum + "번 님의 주문 음료는 " + coffeeList.get(i).getCoffeeName() + "이며, 가격은 " + coffeeList.get(i).getPrice() + "원 입니다.");
		}
		System.out.println("총 금액은 " + totalPrice + "원 입니다.");
		System.out.println("현재 남은 금액은 " + money + "원 입니다.");
	}

}
