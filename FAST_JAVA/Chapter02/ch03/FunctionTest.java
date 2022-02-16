package ch03;

public class FunctionTest {
	
	// 반환값이 int 형이면서 매개변수 2개 메서드
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 반환값이 void 이고 매개변수 1개 메서드
	static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 반환값이 int 이면 매개변수가 없는 메서드
	static int calcSum() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int result = add(a, b);
		System.out.println("a + b = " + result);
		
		sayHello("안녕하세요");
		
		int total = calcSum();
		System.out.println(total);
		
		
	}

}
