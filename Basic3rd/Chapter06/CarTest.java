package exConstructor;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("blue", "auto", 2);
		Car c3 = new Car("red");
		Car c4 = new Car("Orange", 6);
		
		System.out.println("c1의 color = " + c1.color + ", c1의 gearType = " + c1.gearType + ", c1의 door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", c2의 gearType = " + c2.gearType + ", c2의 door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", c3의 gearType = " + c3.gearType + ", c3의 door = " + c3.door);
		System.out.println("c4의 color = " + c4.color + ", c4의 gearType = " + c4.gearType + ", c4의 door = " + c4.door);
		
		System.out.println("=========================================================================================");
		
		Car c5 = new Car();
		Car c6 = new Car(c5);
		c5.door = 100;
		System.out.println("c5의 color = " + c5.color + ", c5의 gearType = " + c5.gearType + ", c5의 door = " + c5.door);
		System.out.println("c6의 color = " + c6.color + ", c6의 gearType = " + c6.gearType + ", c6의 door = " + c6.door);
		
	}

}
