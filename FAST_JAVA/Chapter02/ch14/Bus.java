package ch14;

public class Bus {
	
	int number;
	int money;
	int count;
	
	Bus(int number) {
		this.number = number;
	}
	
	void take(int money) {
		this.money += money;
		count++;
	}
	
	public void showInfo() {
		System.out.println(number +"�� �°� ���� " +  count + "�̰�, ������ " + money + "�Դϴ�.");
	}

}
