package exFactorial;

public class Factorial {
	
	int factorial(int i) {
		int result = 0;
		
		if (i == 1) {
			result = 1;
		} else {
			result = i * factorial(i - 1); // 다시 메서드 자신을 호출한다.
		}
		
		return result;
	}
	
	long factorial2(int n) {
		if (n <= 0 || n > 20) return -1; // 매개변수의 유효성 검사.
		if (n <= 1) return 1;
		return n * factorial2(n - 1);
	}

}
