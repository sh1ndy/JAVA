package ex07;

// ���� Ŭ����
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

// �ڼ� Ŭ����
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

		// Car�������� ����ȯ
		c = f; // �ڼ��� �������� ����ȯ �� �� ����ȯ ���� ����
		c.color = "I don't Know";
		c.door = 2;
		System.out.println("Car color = " + c.color + ", door = " + c.door);
		c.drive();
		c.stop();
//		c.water();	// CarŸ�Կ��� water() istance member�� �������� ���� ��� �Ұ�

		System.out.println();

		// FireEngine �ڼ����� ����ȯ
		fe = (FireEngine) c;
		fe.color = "Yellow";
		fe.door = 2;
		System.out.println("FireEngine color = " + fe.color + ", door = " + fe.door);
		fe.drive();
		fe.stop();
		fe.water(); // FireEngineŸ�Կ��� water() instance member�� �����ϹǷ� ��� ����

	}

}
