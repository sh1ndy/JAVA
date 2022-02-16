package ch10;

public class ConstanceTest {

	public static void main(String[] args) {

		// 상수일 경우 변수명을 대문자로 작성해준다.
		final int MAX_NUM = 100;
		final int MIN_NUM = 0;
		
		
		// MAX_NUM = 101; 	// 에러! 상수는 변화지 않아야한다.
		// MIN_NUM = 1; 	// 에러! 상수는 변화지 않아야한다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
