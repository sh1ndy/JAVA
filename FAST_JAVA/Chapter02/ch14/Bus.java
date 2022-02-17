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
		System.out.println(number +"번 승객 수는 " +  count + "이고, 수입은 " + money + "입니다.");
	}

}
