class AAA { // AAA는 BBB의 외부 클래스
	int i = 100;
	
	class BBB { // BBB는 AAA의 내부 클래스
		void method() {
			System.out.println(i);
		}
	}
}


//class CCC {
//	BBB b = new BBB();
//}

public class InnerTest {

	public static void main(String[] args) {

//		BBB b = new BBB();
//		b.method();
		
	}

}
