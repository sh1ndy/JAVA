package ex13;

class TestClass {
	int iv;
	static int cv;
	
	void instanceMethod() {		// 인스턴스 메서드
		System.out.println(iv);	// 인스턴스 변수를 사용할 수 있다.
		System.out.println(cv);	// 클래스 변수를 사용할 수 있다.
	}
	
	static void staticMethod() {	// static 메서드
//		System.out.println(iv);		// 에러!! 인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);		// 클래스 변수는 사용할 수 있다.
	}
}

class TestClass2 {
	void instanceMethod() {
		// 인스턴스 메서드
	}
	
	static void staticMethod() {
		// static 메서드
	}
	
	void instanceMethod2() {
		instanceMethod();	// 다른 인스턴스 메서드를 호출한다.
		staticMethod();		// static 메서드를 호출한다.
	}
	
	static void staticMethod2() {
//		instanceMethod();	// 에러!!! 인스턴스 메서드를 호출 할 수 없다.
		staticMethod();		// static 메서드는 호출 할 수 있다.
	}
}

public class Ex6_13 {

	public static void main(String[] args) {
	

	}

}
