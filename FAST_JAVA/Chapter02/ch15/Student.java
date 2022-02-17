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
		System.out.println(name + "학생의 남은 돈은 " + money + "원 입니다.");
	}

}
