package ch14;

public class Student {
	
	String name;
	int money;
	
	Student() {
		
	}
	
	Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(name + "«–ª˝¿« ¿‹µ∑¿∫ " + money + "¿‘¥œ¥Ÿ");
	}
}
