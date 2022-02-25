
public class PrintfEx1 {

	public static void main(String[] args) {
		
		// printf() 사용법 1-1
		System.out.printf("%d%n", 15); // 10진수
		System.out.printf("%#o%n", 15); // 8진수
		System.out.printf("%#x%n", 15); // 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15));	// 2진수
		
		float f = 123.456789f;
		System.out.printf("%f%n", f);	// 정밀도 7자리까지만 정확함
		double d = 123.456789;
		System.out.printf("%f%n", d);	// 정밀도 15자리까지 정확함
		
		System.out.printf("%e%n", f);	// 지수형태로 출력
		System.out.printf("%g%n", f);	// 소수점 포함 간략하게 출력
		
	}

}
