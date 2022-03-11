
public class OperatorEx8 {

	public static void main(String[] args) {

		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // int값이 먼저 대입된 후에 long으로 형변환 되어서 원하는 값이 나오지 않는다.
		System.out.println(c);
		
	}

}
