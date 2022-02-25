
public class PrintfEx2 {

	public static void main(String[] args) {

		// printf() 사용법 1-2
		System.out.printf("[%5d]%n", 12345678);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d); // 자리수 총 14자리에 소수점은 10자리 까지
		double d2 = 1.23456789123;
		System.out.printf("%18.4f%n", d2);
		System.out.printf("%.4f%n", d2);
		
		System.out.printf("[%s]%n", "wwww.codechobo.com");
		System.out.printf("[%20s]%n", "wwww.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.6s]%n", "www.codechobo.com");
		
	}

}
