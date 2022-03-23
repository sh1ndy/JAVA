package day0323;

public class InnerEx2 {
	
	class InstanceInner {}
	static class StaticInner {}
	
	// �ν��Ͻ���� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	// static ��� ������ ���� ���� ������ �����ϴ�.
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static����� �ν��Ͻ������ ���� ������ �� ����.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		// �ν��Ͻ��޼��忡���� �ν��Ͻ� ����� static��� ��� ���� �����ϴ�.
		InstanceInner iv = new InstanceInner();
		StaticInner cv = new StaticInner();
		
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {
			LocalInner lv = new LocalInner();
		}
	}
}
