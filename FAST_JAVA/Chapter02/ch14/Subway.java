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
		System.out.println(lineNumber +"�� �°� ���� " +  count + "�̰�, ������ " + money + "�Դϴ�.");
	}

}
