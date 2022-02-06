package ex07;

// 조상 클래스
class Car {
	String color;
	int door;

	void drive() {
		System.out.println("Drive~~~~~~~");
	}

	void stop() {
		System.out.println("Stop Stop!!");
	}
}

// 자손 클래스
class FireEngine extends Car {
	
	void water() {
		System.out.println("Water!~~~~~~");
	}
}

// Main Method
public class Ex7_7 {

	public static void main(String[] args) {


		Car c = null;
		FireEngine f = new FireEngine();
		
		FireEngine fe = null;

		f.color = "RED";
		f.door = 4;
		System.out.println("FireEngine color = " + f.color + ", door = " + f.door);
		f.drive();
		f.stop();
		f.water();

		System.out.println();

		// Car조상으로 형변환
		c = f; // 자손이 조상으로 형변환 할 시 형변환 생략 가능
		c.color = "I don't Know";
		c.door = 2;
		System.out.println("Car color = " + c.color + ", door = " + c.door);
		c.drive();
		c.stop();
//		c.water();	// Car타입에는 water() istance member가 존재하지 않음 사용 불가

		System.out.println();

		// FireEngine 자손으로 형변환
		fe = (FireEngine) c;
		fe.color = "Yellow";
		fe.door = 2;
		System.out.println("FireEngine color = " + fe.color + ", door = " + fe.door);
		fe.drive();
		fe.stop();
		fe.water(); // FireEngine타입에는 water() instance member가 존재하므로 사용 가능

	}

}
