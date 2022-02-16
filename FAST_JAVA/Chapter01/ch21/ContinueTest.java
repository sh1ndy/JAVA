package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 1 ~ 100까지 숫자 중 3의 배수를 출력하세요.
		for (int i = 1; i <= 100; i++) {
			// i 를 3으로 나눠서 0이 아닐경우 조건문을 탈출 하라
			if ((i % 3) != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
