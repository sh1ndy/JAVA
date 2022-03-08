class Parent2 {
	int x;	// suerp.x와 this.x 둘다 가능
}

class Child2 extends Parent {
	void mathod() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex7_3 {

	public static void main(String[] args) {

		Child2 c = new Child2();
		c.mathod();
		
	}

}
