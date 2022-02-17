package ch15;

public class Student {
	
	String name;
	int money;
	
	Student() {
		
	}
	
	Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void takeTaxi(Taxi t) {
		t.take(10000);
		money -= 10000;
	}
	
	void showInfo() {
		System.out.println(name + "�л��� ���� ���� " + money + "�� �Դϴ�.");
	}

}
