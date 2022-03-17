package exCallStack;

public class CallStackTest2 {

	public static void main(String[] args) {

		System.out.println("Main(Sting[] args) 시작되었습니다.");
		firstMethod();
		System.out.println("Main(Sting[] args) 종되었습니다.");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod 시작되었습니다.");
		secondMethod();
		System.out.println("firstMethod 종료되었습니다.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod 시작되었습니다.");
		System.out.println("secondMethod 종되었습니다.");
	}

}
