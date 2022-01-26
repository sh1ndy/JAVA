
public class Ex3_9 {

	public static void main(String[] args) {
		
		int z = 10;
		int y = 20;
		int result = z > y ? 1 : -1;
		System.out.println(result);
		
		boolean result1 = z > y ?  true : false;
		System.out.println(result1);
		
		
		int i = 10;
		int j = 5;
		
		System.out.println(i += i); // 20
		System.out.println(i -= i); // 0
		System.out.println(i *= i); // 100
		System.out.println(i /= i); // 1
		System.out.println(i *= i + j); // 150
		
	}

}
