
public class Ex4_9 {

	public static void main(String[] args) {

		// 중첩 for문을 이용한
		// 2단 ~ 9단까지 구구단 표 출려 해보기

		// 단을 위한 for 문 작성 2 ~ 9
		for (int i = 2; i < 10; i++) {
			System.out.println(); // 띄어쓰기를 위한 빈 문자열 출력
			// 곱셈을 위한 for 문 작성 1 ~ 9
			for (int j = 1; j < 10; j++) {
				// 구구단 출력
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}

	}

}
