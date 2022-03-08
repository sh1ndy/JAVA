import java.util.Arrays;

class MyMath {

	// 반환값이 int타입이며 매개변수는 2개를 받고 두 값을 더한값을 반환해주는 기능
	int add(int a, int b) {
		return a + b;
	}

	// 반환값이 int타입이며 매개변수는 2개를 받고 두 값을 마이너스한 값을 반환해주는 기능
	int substract(int a, int b) {
		return a - b;
	}

	// 반환값이 int타입이며 매개변수는 2개를 받고 두 값을 곱한값을 반환해주는 기능
	long multiple(long a, long b) {
		return a * b;
	}

	// 반환값이 int타입이며 매개변수는 2개를 받고 두 값을 나눈값을 반환해주는 기능
	double divide(int a, int b) {
		return a / b;
	}

	// 반환값이 int타입이며 매개변수는 배열의 길이만큼 받고 모두 값을 더한값을 반환해주는 기능
	int addAll(int[] a) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}

		return total;
	}

	// 반환값이 int배열 이며 매개변수는 없고 배열을 초기화한 값들을 반환해주는 기능
	int[] addRes() {
		int[] arr = { 10, 20, 30, 40, 50 };
		return arr;
	}

	// 매개변수 2개의 값중에 큰값을 반환해주는 메서드
	int max(int a, int b) {
		return a > b ? a : b;
	}

	// 매개변수 2개의 값중에 작은값을 반환해주는 메서드
	int min(int a, int b) {
		return a < b ? a : b;
	}

	// 구구단 호출
	void printGugudan(int dan) {
		int result = 0;
		if (!(2 <= dan && dan <= 9)) {
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d%n", dan, i, dan * i);
		}

	}
}

public class Ex6_4 {

	public static void main(String[] args) {

		int[] iArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		MyMath mm = new MyMath();
		int addResult = mm.add(20, 10);
		int substractResult = mm.substract(20, 5);
		long multipleResult = mm.multiple(100L, 30L);
		double divideResult = mm.divide(10, 3);
		int addAll = mm.addAll(iArr);
		int[] methodArr = mm.addRes();

		System.out.println("addResult = " + addResult);
		System.out.println("substractResult = " + substractResult);
		System.out.println("multipleResult = " + multipleResult);
		System.out.println("divideResult = " + divideResult);
		System.out.println("addAll = " + addAll);
		System.out.println(Arrays.toString(methodArr));

		// 값을 저장은 못하고 호출만 한다.
		System.out.println(mm.max(10, 20)); // 20
		System.out.println(mm.max(30, 20)); // 30
		System.out.println(mm.min(1, 2)); // 1
		System.out.println(mm.min(8, 5)); // 5

		// 구구단 호출
		mm.printGugudan(9);

	}

}
