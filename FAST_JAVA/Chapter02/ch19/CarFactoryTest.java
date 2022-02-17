package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car thirdSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum()); // 10001 ���
		System.out.println(yourSonata.getCarNum()); // 10002 ���
		System.out.println(thirdSonata.getCarNum()); // 10003 ���

	}

}
