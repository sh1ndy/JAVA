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
		car = fe; // car = (Car) fe; ���� ����ȯ�� ������ ����
//		car.water() // car ������������ water�� ������������
		fe2 = (FireEngine) car; // ����Ÿ���� �ڼ�Ÿ������ �ٲ𶧴� ����ȯ ��������� �ؾ���
		fe2.water();
		
	}

}
