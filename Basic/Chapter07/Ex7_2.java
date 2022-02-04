package ex02;

class Parent {
	int x = 10; // super.x
}

class Child extends Parent {
	int x = 20; // this.x

	void method() {
		System.out.println("x = " + x);			// 20
		System.out.println("this.x = " + this.x);	// 20
		System.out.println("super.x = " + super.x);	// 10
	}
}

public class Ex7_2 {

	public static void main(String[] args) {

		Child c = new Child();
		c.method();

	}

}
