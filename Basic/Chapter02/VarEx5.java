
public class VarEx5 {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		
		// 정수타입의 문자의 값을 저장하면 자동으로 정수형태의 값으로 바껴서 출력된다.
		int i = 'Z';
		System.out.println(i);
		
		// 문자타입의 정수의 값을 저장하면 자동으로 문자형태의 값으로 바껴서 출력된다.
		char c = 90;
		System.out.println(c);
		
		String str = ""; // 빈 문자열 (empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		// 사칙연산은 왼쪽에서 부터 시작 문자열이 하나라도 들어있으면 문자열로 바뀜
		System.out.println("" + 7 + 7); // 77
		System.out.println(7 + 7 + ""); // 14
		
	}

}
