package ch10;

public class AICar extends Car {

	@Override
	void driver() {
		System.out.println("���� ���� �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	void stop() {
		System.out.println("��ֹ� �տ��� ������ ����ϴ�.");
	}

	@Override
	void wiper() {
		System.out.println("����°� �����ϰ� �ڵ����� �����۰� �����ϴ�.");
	}
	
	@Override
	void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");
	}

}
