
public class Ex4_11 {

	public static void main(String[] args) {

		// 2단 ~ 9단까지의 구구단을 출력하세요.
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		
	}

}
