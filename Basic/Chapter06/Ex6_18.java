package ex18;

class MyMath {
	int x;	// this.x <-- 진짜 이름(생략 가능)
	int y;	// this.y <-- 진짜 이름(생략 가능)
	
	MyMath() {
		// this() 생성자 호출
		this(30, 40);
	}
	
	// 매개변수가 있는 생성자
	MyMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class Ex6_18 {

	public static void main(String[] args) {
		
		// 기본 생성자
		MyMath mm = new MyMath();
		System.out.println(mm.x);
		System.out.println(mm.y);
		
		// 매개변수 생성자
		MyMath mm2 = new MyMath(60, 80);
		System.out.println(mm2.x);
		System.out.println(mm2.y);

	}

}
