
public class ExceptionEx6 {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나누어서 ArithmeticException 발생
			System.out.println(4); // 실행되지 않음
		} catch (Exception e) { // ArithmeticException 대신 Exception을 사용
			System.out.println(5);
		}
		System.out.println(6);
	}

}
