
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive Brrrr~~~");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();
		fe.water();
		
		Car c = fe;
		// c.water(); // 애러. Car 타입에는 water 메서드가 존재하지 않음.
		FireEngine fe2 = (FireEngine) c;
		fe2.water();
		
		
	}

}
