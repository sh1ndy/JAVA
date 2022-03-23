package day0323;

public class InnerEx2 {
	
	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static멤버는 인스턴스멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		// 인스턴스메서드에서는 인스턴스 멤버와 static멤버 모두 접근 가능하다.
		InstanceInner iv = new InstanceInner();
		StaticInner cv = new StaticInner();
		
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {
			LocalInner lv = new LocalInner();
		}
	}
}
