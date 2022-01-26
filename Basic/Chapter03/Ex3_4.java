
public class Ex3_4 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		// 실수로 값을 받고 싶다면 float로 형변환을 하면 된다.
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
	}

}
