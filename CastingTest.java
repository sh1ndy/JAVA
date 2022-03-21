class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!!");
	}
}

public class CastingTest {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car) fe; 에서 형변환이 생략된 형태
//		car.water() // car 참조변수에는 water가 존재하지않음
		fe2 = (FireEngine) car; // 조상타입이 자손타입으로 바뀔때는 형변환 명시적으로 해야함
		fe2.water();
		
	}

}
