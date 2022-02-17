package ch19;

public class Money {
	
	private static int serialNum = 1000;
	private int moneyNum;
	
	Money() {
		serialNum++;
		moneyNum = serialNum;
	}
	
	public int getMoneyNum() {
		return moneyNum;
	}

}
