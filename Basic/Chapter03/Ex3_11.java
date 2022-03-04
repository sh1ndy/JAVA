
public class Ex3_11 {

	public static void main(String[] args) {

		double shortPI = 3.141592;
		System.out.println(shortPI);
		System.out.println(shortPI * 1000);
		System.out.println((int) (shortPI * 1000)); // 값손실로 원하는 소수점 자리 밑으로 자른다.
		System.out.println((int) (shortPI * 1000) / 1000.0);
		
		int x = 10;
		int y = 8;
		
		System.out.println("몫 : x / y = " + x / y);
		System.out.println("나머지 : x % y = " + x % y);
		
		
	}

}
