
public class OperatorEx10 {

	public static void main(String[] args) {

		int a = 1000000;
		
		int result1 = a * a / a; // 곱한값이 int범위를 넘어서 overflow 발셍
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
		
	}

}
