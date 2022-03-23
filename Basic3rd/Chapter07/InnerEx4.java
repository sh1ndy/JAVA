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

		// 인스턴스클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야한다.
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		
		System.out.println("ii.iv = " + ii.iv);
		System.out.println("Outer.StaticInner.cv = " + Outer.StaticInner.cv);
		
		// 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner is = new Outer.StaticInner();
		System.out.println("is.iv = " + is.iv);
		
	}

}
