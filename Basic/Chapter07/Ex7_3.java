package ex03;

class Parent {
	int x = 10; // super.x �� this.x �Ѵ� ����
}

class Child extends Parent {
	void method() {
		System.out.println("x = " + x);		// 10
		System.out.println("this.x = " + this.x);	// 10
		System.out.println("super.x = " + super.x);	// 10
	}
}

public class Ex7_3 {

	public static void main(String[] args) {

		Child c = new Child();
		c.method();

	}

}
