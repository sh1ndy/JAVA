// ������ ����
class A {
	void method(I i) { // �����佺 I ������ Ŭ�����鸸 ��� �� �� ����
		i.method();
	}
}

interface I {
	void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼ҵ�");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼ҵ�");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {

		A a = new A();
		a.method(new C());	// interface�� method�� ������ ��� Ŭ���� ��� ����

	}

}
