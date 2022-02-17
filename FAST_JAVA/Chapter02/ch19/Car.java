package ch19;

public class Car {
	
	private static int serialNum = 1000;
	private int carNum;
	
	Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	int getCarNum() {
		return carNum;
	}

}
