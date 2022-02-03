package ex12;

class MyMath {
	int x;
	int y;
	
	int add() {
		return x + y;
	}
	
	static int add(int x, int y) {
		return x + y;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {

		// 객체 생성 없이 사용 가능, iv 사용 안함
		System.out.println("static method add() = " + MyMath.add(10, 20)); // static 메서드 호출
		
		// 객체 생성 후 사용 가능, iv 사용
		MyMath mm = new MyMath();
		mm.x = 30;
		mm.y = 40;
		System.out.println("instance method add() = " + mm.add());	// instance 메서드 호출
		
	}

}
