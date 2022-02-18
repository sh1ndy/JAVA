package ch14;

public class CompleteCalc extends Calculator {

	@Override
	public int multiple(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		}
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		}
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모든 메서드 구현 완료!");
	}

}
