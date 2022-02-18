package ch10;

public abstract class Car {
	
	abstract void driver();
	abstract void stop();
	abstract void wiper();
	
	void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	// hook method 추상메서드가 아님 언제든지 재정의해서 사용 가능
	void washCar() {
		
	}
	
	// final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
	final void run() {
		startCar();
		driver();
		stop();
		turnOff();
	}

}
