
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
		// c.water(); // �ַ�. Car Ÿ�Կ��� water �޼��尡 �������� ����.
		FireEngine fe2 = (FireEngine) c;
		fe2.water();
		
		
	}

}
