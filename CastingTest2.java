
public class CastingTest2 {

	public static void main(String[] args) {

		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		Car car3 = new FireEngine();
		car3.drive();
		
//		car.drive();
//		fe = (FireEngine) car;
//		fe.drive();
//		car2 = fe;
//		car2.drive();
		
	}

}
