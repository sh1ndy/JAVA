
public class VarEx2 {
	public static void main(String[] args) {
		// x, y의 서로 값을 변경 방법
		int x = 4;
		int y = 2;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("==============");
		
		int tmp = x; // x의 값을 tmp에 저장
		x = y; // y의 값을 x에 저장
		y = tmp; // tmp의 값을 y의 저장
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
}
