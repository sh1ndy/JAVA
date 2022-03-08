class A {
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ���� �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ���� �޼���");
	}
}

class D implements I {
	public void method() {
		System.out.println("DŬ���� �޼���");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {

		A a = new A();
		a.method(new D());
		
	}

}
