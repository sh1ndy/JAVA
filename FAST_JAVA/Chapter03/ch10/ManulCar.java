package ch10;

public class ManulCar extends Car {

	@Override
	void driver() {
		System.out.println("사람이 운전 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.");
	}

	@Override
	void wiper() {
		System.out.println("사람이 와이퍼를 작동시켰습니다.");
	}

}
