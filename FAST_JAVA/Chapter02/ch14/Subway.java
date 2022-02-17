package ch14;

public class Subway {
	
	int lineNumber;
	int money;
	int count;
	
	Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	void take(int money) {
		this.money += money;
		count++;
	}
	
	void showInfo() {
		System.out.println(lineNumber +"번 승객 수는 " +  count + "이고, 수입은 " + money + "입니다.");
	}

}
