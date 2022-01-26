
public class Ex3_8 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x < y);		// x가 y보다 작다 true
		System.out.println(x > y);		// x가 y보다 크다 false
		System.out.println(x >= y);		// x가 y보다 크거나 같다 false
		System.out.println(x <= y);		// x가 y보다 작거나 같다 false
		System.out.println(x == y);		// x가 y랑 같다 false
		
		System.out.println(1 < x && x < 11); 	// 1이 x보다 작고 x가 11보다 작다 true
		System.out.println(x % 2 == 0 || x % 3 == 0); // x는 2의 배수 이거나 x는 3의 배수이다 true
		
		char c = 'c';
		System.out.println('a' < c && c < 'f'); // a < c < f 이기때문에 true
		
		// 좌항 의 값도 true 이고 우황의 값도 ture 이기때문에 true
		System.out.println((1 < 2 && 2 < 4) && (4 > 2 && 5 > 4)); 
		
		// 좌항 의 값은 true 이고 우황의 값은 false 이지만 or 연산 이기때문에 true
		System.out.println((1 < 2 && 2 < 4) || (1 > 2 && 4 > 4));
		
		System.out.println(x != 11); // x랑 11이랑 다르다 true
		System.out.println(x != 10); // x랑 10이랑 다르지 않다 false
		System.out.println(!(x != 10)); // true
		
	}

}
