
class Animal {
	
}

class Tiger extends Animal {
	
}

class Eagle extends Animal {
	
}

public class InstanceofTest2 {
	
	public static void main(String[] args) {
		
		Animal a = new Eagle();
		
		if (a instanceof Animal) {
			System.out.println("This is Animal instance.");
		}
		
		if (a instanceof Tiger) {
			System.out.println("this is Tiger instance.");
		}
		
		if (a instanceof Eagle) {
			System.out.println("this is Eagle instance.");
		}
		
		if (a instanceof Object) {
			System.out.println("this is Object instance.");
		}

	}

}
