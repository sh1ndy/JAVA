package ch10;

public class AICar extends Car {

	@Override
	void driver() {
		System.out.println("자율 주행 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
	}

	@Override
	void wiper() {
		System.out.println("비오는걸 감지하고 자동으로 와이퍼가 켜집니다.");
	}
	
	@Override
	void washCar() {
		System.out.println("자동 세차를 합니다.");
	}

}
