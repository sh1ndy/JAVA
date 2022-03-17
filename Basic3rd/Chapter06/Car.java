package exConstructor;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car() {
		color = "black";
		gearType = "auto";
		door = 4;
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, int door) {
		this(color, "menual", door);
	}
	
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}

}
