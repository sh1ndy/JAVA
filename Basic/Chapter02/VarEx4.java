
public class VarEx4 {

	public static void main(String[] args) {
		// boolean 초기값 - false
		boolean bool = false;
		System.out.println(bool);
		
		// byte = -128 ~ 127
		byte b = 127;
		System.out.println(b);
		
		// 접두사 0 - 8진수, 10진수로 8
		System.out.println(010);
		// 접두사 0x - 16진수, 10진수로 16
		System.out.println(0x10);
		
		// 타입의 범위가 좁은거를 큰거에 저장할 때는 접미상 생략 가능
		long l1 = 1_000_000_000;
		System.out.println(l1);
		// 범위가 벗어나면 접미사를 붙여 줘야한다.
		long l2 = 10_000_000_000L;
		System.out.println(l2);
		
		// 실수(float) 리터럴에 접미사를 붙여줘야한다.
		float f = 3.14f;
		System.out.println(f);
		// 실수 (double) 리러럴에는 접미사가 필요없다. 실수의 기본값은 double타입이다.
		double d = 3.14;
		System.out.println(d);
		
		// 소수점 앞 뒤 자리들은 생랼 가능하다.
		System.out.println(10.);
		System.out.println(.10);

	}

}
