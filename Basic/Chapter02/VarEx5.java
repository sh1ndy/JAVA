
public class VarEx5 {

	public static void main(String[] args) {

		// 변수 선언과 초기화
		int x = 10;
		int y = 20;
		
		// 변수 선언만 (초기화 난중에 해됨)
		int tmp;
		
		System.out.println("x , y : " + x + " , " + y);
		
		tmp = x; // tmp 에 x 대입
		x = y; 	 // x 에 y 대입
		y = tmp; // y 에 tmp 대입
		System.out.println("x , y : " + x + " , " + y);
		
		
		
	}

}
