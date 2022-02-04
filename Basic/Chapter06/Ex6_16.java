package ex16;

class Car {
	String color;
	int gearType;
	
	Car(String c, int g) {
		color = c;
		gearType = g;
	}
}

public class Ex6_16 {

	public static void main(String[] args) {
		
		Car c = new Car("white", 4);
		
		System.out.println(c.color);
		System.out.println(c.gearType);

	}

}
