
public class Ex3_5 {

	public static void main(String[] args) {
		
		// 1,000,000	1백만 = 10의 6제곱
		int a = 1_000_000;
		// 2,000,000	2백만 = 10의 6제곱
		int b = 2_000_000;
		
		// 10의 12제곱.	int의 범위는 10의 9제곱
		// a, b 값을 형변환 시켜봤자 아무 소용없다 처음부터 잘못된 값 이기 때문에
		long c1 = (long)(a * b);
		System.out.println(c1);
		
		// a, b 중 하나의 값을 long 타입으로 먼저 형변환을 시키여한다.
		long c2 = (long)a * b; 
		System.out.println(c2);
	}

}
