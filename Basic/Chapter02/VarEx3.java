
public class VarEx3 {

	public static void main(String[] args) {

		// 논리형
		boolean power = false;
		System.out.println(power);
		
		// 바이트
		byte b = 127;
		System.out.println(b);
		
		// 접미사는 출력 안됨
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		// long
		long l = 10_000_000_000L;
		
		// float
		float f = 3.14f;
		
		// double
		double d = 3.14;
		
		System.out.println(10.); // 10.0; (double)
		System.out.println(.10); // 0.1; (double)
		System.out.println(10f); // 10.0; (float)
		System.out.println(1e3); // 1000.0; (double)
		
	}

}
