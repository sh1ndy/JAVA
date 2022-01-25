
public class PrintfEx1 {

	public static void main(String[] args) {

		// 실수로 나눠서 값을 얻을려면 두자리 중 하나는 소수점으로 계산하여야한다.
		System.out.println(10.0/3);
		
		// printf() -> 줄바꿈 %n을 사용해줘야지 줄 바꿈이 가능하다.
		System.out.printf("%d%n", 15);	// 10진수
		System.out.printf("%o%n", 15);	// 8진수
		System.out.printf("%x%n", 15);	// 16진수
		
		// 지시자를 보이게 출력할려면 #을 앞에 붙인다.
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		// 10진수를 2진수로 바꿀려면 Integer.toBinaryString으로 출력하여 한다.
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f1 = 123.4567890f;
		System.out.printf("%f%n", f1); // 정밀도 때문에 7자리 수 까지만 맞음
		
		double f2 = 123.4567890;
		System.out.printf("%f%n", f2); // double은 정밀도가 15자리 수 까지 맞음
		System.out.printf("%e%n", f2); // 지수 형태
		
		
	}

}
