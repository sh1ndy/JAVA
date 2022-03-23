package day0323;

interface I {
	void method();
}

class A {
	public void method(I i) {
		i.method();
	}
}

class B implements I {
	public void method() {
		System.out.println("method B()");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}

}
