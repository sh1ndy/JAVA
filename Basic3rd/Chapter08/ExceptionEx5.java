
public class ExceptionEx5 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나누어서 ArithmeticException 발생
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
