package ex08;

class MyMath {
	// 반환 타입이 void인 경우
	void printGugudan(int dan) {
		// 2 ~ 9 까지의 매개변수가 들어왔을 때만 구구단을 출력
		if (2 <= dan && dan < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d%n", dan, i, dan * i);
			}
		} else {
			return; // 입력 받은 값이 2 ~ 9가 아니면, 메서드 종료하고 돌아기기
		}
	}
	
	// 반환 타입이 있는 경우
	long max(long a, long b) {	// 두 값을 받아서 둘 중에 큰값을 반환해 주는 메서드
		if (a > b) {
			return a;	// 조건식이 참일때만 실행
		} else {
			return b;	// 조건식이 거짓일 때 실행
		}
	}
}

public class Ex6_8 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		mm.printGugudan(9);
		System.out.println("max(a, b) = " + mm.max(7L, 10L));

	}

}
