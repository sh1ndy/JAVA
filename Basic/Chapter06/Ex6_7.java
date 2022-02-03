package ex07;

class MyMath {
	long add(long a, long b) {
		return a + b;
	}
	
	long substract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
	
	long max(long a, long b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	long min(long a, long b) {
		return a > b ? b : a;
	}
}

public class Ex6_7 {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);	// add메서드 호출
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(15, 10);
		long result6 = mm.min(5, 8);
				
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(a, b) = " + result5);
		System.out.println("min(a, b) = " + result6);
		
		
		
	}

}
