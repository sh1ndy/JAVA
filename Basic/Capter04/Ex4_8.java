
public class Ex4_8 {

	public static void main(String[] args) {
		
		// i 부터 10보다 작을때 까지 반복하고 i의 값을 1씩 증가 시켜라
		System.out.println("========== 1번 ============");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// i 부터 0보다 클때 까지 반복하고 i의 값을 1씩 감소 시켜라
		System.out.println("========== 2번 ============");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		// i 부터 10보다 작을 때 까지 반복하고 i의 값을 2씩 증가시켜라
		System.out.println("========== 3번 ============");
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}

		// i 부터 10보다 작을때 까지 반복하고 i의 값을 2의 배수로 증가시켜라
		System.out.println("========== 4번 ============");
		for (int i = 1; i < 10; i *= 2) {
			System.out.println(i);
		}
		
		// i 부터 10보다 작을때 까지 반복하고 i은 1씩증가 시키고 j의 값은 1씩 감소시켜라
		System.out.println("========== 5번 ============");
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
	}

}
