
public class Ex4_16 {

	public static void main(String[] args) {

		// 0 ~ 10 숫자중에서 3의 배수를 제외한 모든 값 출력하기

		for (int i = 0; i < 10; i++) {
			// i를 3으로 나웠을때 나머지가 0이될 때
			if (i % 3 == 0) {
				// 해당 값 출력을 제외하고 반복문은 계속 실행된다.
				continue;
			}
			System.out.println(i);
		}

	}

}
