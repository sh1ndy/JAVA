package ex13;

class TestClass {
	int iv;
	static int cv;
	
	void instanceMethod() {		// �ν��Ͻ� �޼���
		System.out.println(iv);	// �ν��Ͻ� ������ ����� �� �ִ�.
		System.out.println(cv);	// Ŭ���� ������ ����� �� �ִ�.
	}
	
	static void staticMethod() {	// static �޼���
//		System.out.println(iv);		// ����!! �ν��Ͻ� ������ ����� �� ����.
		System.out.println(cv);		// Ŭ���� ������ ����� �� �ִ�.
	}
}

class TestClass2 {
	void instanceMethod() {
		// �ν��Ͻ� �޼���
	}
	
	static void staticMethod() {
		// static �޼���
	}
	
	void instanceMethod2() {
		instanceMethod();	// �ٸ� �ν��Ͻ� �޼��带 ȣ���Ѵ�.
		staticMethod();		// static �޼��带 ȣ���Ѵ�.
	}
	
	static void staticMethod2() {
//		instanceMethod();	// ����!!! �ν��Ͻ� �޼��带 ȣ�� �� �� ����.
		staticMethod();		// static �޼���� ȣ�� �� �� �ִ�.
	}
}

public class Ex6_13 {

	public static void main(String[] args) {
	

	}

}
