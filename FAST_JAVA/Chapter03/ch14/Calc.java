package ch14;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiple(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 메서드는 재정의 가능하다.
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for (int a : arr) {
			total += a;
		}
		
		return total;
	}

}
