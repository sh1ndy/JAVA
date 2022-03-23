package day0323;

public class DefaultMethodTest {

	public static void main(String[] args) {

		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		MyInterface3.staticMethod();
		
	}

}

class Parent {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

class Child extends Parent implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child");	// 오보라이딩
	}
	
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	default void method3() {
		System.out.println("method3() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

interface MyInterface3 {
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface3");
	}
}


