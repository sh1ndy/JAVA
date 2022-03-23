package day0323;

class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int lv = 400;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {

		// �ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		// �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		
		System.out.println("ii.iv = " + ii.iv);
		System.out.println("Outer.StaticInner.cv = " + Outer.StaticInner.cv);
		
		// ����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer.StaticInner is = new Outer.StaticInner();
		System.out.println("is.iv = " + is.iv);
		
	}

}
