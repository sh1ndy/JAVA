package ch15;

public class Taxi {
	
	String name;
	int money;
	
	Taxi() {
		
	}
	
	Taxi(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void take(int money) {
		this.money += money;
	}
	
	void showInfo() {
		System.out.println(name + " �ý� ������ " + money + "�� �Դϴ�.");
	}

}
