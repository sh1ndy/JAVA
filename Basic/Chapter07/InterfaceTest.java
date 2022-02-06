// 느슨한 의존
class A {
	void method(I i) { // 인터페스 I 구현한 클래스들만 들어 올 수 있음
		i.method();
	}
}

interface I {
	void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메소드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메소드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {

		A a = new A();
		a.method(new C());	// interface의 method를 구현한 모든 클래스 사용 가능

	}

}
