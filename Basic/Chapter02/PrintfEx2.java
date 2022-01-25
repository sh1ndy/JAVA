
public class PrintfEx2 {

	public static void main(String[] args) {

		// 정수 출력
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%05d]%n", 1234567); // 자리수 초과된 값이 여도 상관없음
		
		// 실수 출력
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d); // 전체 14자리의 10번쨰자리 소수점 까지 출력
		
		// 문자열 출력
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 문자열 출력할 20자리 공간 생성
		System.out.printf("[%-20s]%n", url); // 문자열 출력할 20자리 공간 생성 (반대로)
		System.out.printf("[%.8s]%n", url); // 처음부터 짜르고싶은 자리 수 까지
		
		
	}

}
