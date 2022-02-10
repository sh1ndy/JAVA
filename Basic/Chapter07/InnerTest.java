/// AAA는 BBB의 외부 클래스
class AAA {
	int i = 100;
	
	// BBB는 AAA의 내부 클래스
	class BBB {
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근가능
		}
	}
}


//class CCC {
//	// BBB는 AAA의 내부 클래스 이기 때문에 사용이 불가능 하다.
//	BBB b = new BBB();
//	
//}


public class InnerTest {

	public static void main(String[] args) {

//		BBB b = new BBB();
//		b.method();
		
	}

}
