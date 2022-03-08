
class MyMath2 {
	int x;
	int y;
	
	long add() {
		return x + y;
	}
	
	// 공통으로 쓰는것이 아니라 iv 변수를 사용하느냐 안하느냐의 차이
	// lv변수만 사용할 경우 static 붙여줌
	static long add(long a, long b) {
		return a + b;
	}
}

public class Ex6_9 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 300L));
		
		MyMath2 mm = new MyMath2();
		mm.x = 100;
		mm.y = 200;
		System.out.println(mm.add());

		
	}

}
