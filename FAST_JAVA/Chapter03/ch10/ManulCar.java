package ch10;

public class ManulCar extends Car {

	@Override
	void driver() {
		System.out.println("����� ���� �մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	void stop() {
		System.out.println("��ֹ� �տ��� �극��ũ�� ��Ƽ� �����մϴ�.");
	}

	@Override
	void wiper() {
		System.out.println("����� �����۸� �۵����׽��ϴ�.");
	}

}
