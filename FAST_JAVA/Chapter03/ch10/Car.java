package ch10;

public abstract class Car {
	
	abstract void driver();
	abstract void stop();
	abstract void wiper();
	
	void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	// hook method �߻�޼��尡 �ƴ� �������� �������ؼ� ��� ����
	void washCar() {
		
	}
	
	// final �޼��� : ���� Ŭ�������� ������ �� �� ���� �޼���
	final void run() {
		startCar();
		driver();
		stop();
		turnOff();
	}

}
