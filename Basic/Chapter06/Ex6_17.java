package ex17;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("White", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_17 {

	public static void main(String[] args) {

	}

}
