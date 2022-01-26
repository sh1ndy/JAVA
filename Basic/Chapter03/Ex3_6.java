
public class Ex3_6 {

	public static void main(String[] args) {
		
		// 내가 원하는 소수점 결과 값 얻기
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000.0) / 1000.0;
		System.out.println(shortPi);
		
		//소수점 둘때자리 까지 얻기
		double pi2 = 4.578905;
		double shortPi2 = Math.round(pi2 * 100.0) / 100.0;
		System.out.println(shortPi2);
		
		// 만약에 3.141을 얻을려면
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000));
		System.out.println((int)(pi * 1000) / 1000.0);
	}

}
