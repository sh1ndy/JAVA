
public class Ex3_6 {

	public static void main(String[] args) {

		int x = 10;
		int y = 4;
		
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		System.out.printf("%d * %d = %d%n", x, y, x * y);
		System.out.printf("%d / %d = %d%n", x, y, x / y);	// 정수 나누기 정수는 정수타입의 결과값을 반환 (값손실 일어남)
		System.out.printf("%d / %d = %f%n", x, y, (float) x / y);	// 한쪽이라도 형변환해서 값손실을 없애야함
		
	}

}
