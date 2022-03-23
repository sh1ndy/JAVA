package day0323;

public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근 할 수 없다.
//		int siv = outerIv;
		int scv = outerCv;
	}
	
	void myMethod() {
		int iv = 0;
		final int LV = 0; // JDK1.8부터 final 생략 가능
//		iv = 2;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
			int iiv3 = iv;	// 에러!!! (JDK1.8부터 에러 아님) 값이 변하지 않으면 상수로 체크
			int iiv4 = LV;	// OK
		}
	}

}
