package ex12;

public class ex7_12 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();		// �ν��Ͻ�������� ���� ���� ����
	static StaticInner cv = new StaticInner();	// static ��������� ���� ���� ����
	
	static void staticMethod() {	// static ����� �ν��Ͻ������ ���� ���� �Ұ�
//		InstanceInner obj1 = new InstanceInner();	// ����!
		StaticInner obj2 = new StaticInner();
		
//		Ex7_12 outer = new Ex7_12();	// �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ� ��������
//		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {		// �ν��Ͻ� �޼��忡���� �ν��Ͻ� ����� static ��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();	// ���� ���� Ŭ������ �ܺο��� ������ �� ����.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
