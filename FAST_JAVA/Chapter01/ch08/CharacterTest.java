package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); // int로 형변환
		
		char ch2 = 66;
		System.out.println(ch2);	// char타입이라서 상관없이 B로 출려됨
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);	// 67정수를 char타입으로 형변환해서 유니코드 출력한다.
		
		// 유니코드 사용법
		char han = '\uD55C';
		char ch = '\uD56C';
		System.out.println(han);
		System.out.println(ch);
		
		// char타입은 음수 사용 불가, 2byte넘는 정수는 사용 불가
//		char ch4 = -55;
//		System.out.println(ch4);
		
//		char ch4 = 12345678;
//		System.out.println(ch4);
		
	}

}
