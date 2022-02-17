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
			System.out.println("����ȣ " + customerNum + "�� ���� �ֹ� ����� " + coffeeList.get(i).getCoffeeName() + "�̸�, ������ " + coffeeList.get(i).getPrice() + "�� �Դϴ�.");
		}
		System.out.println("�� �ݾ��� " + totalPrice + "�� �Դϴ�.");
		System.out.println("���� ���� �ݾ��� " + money + "�� �Դϴ�.");
	}

}
