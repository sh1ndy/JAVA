
public class Ex4_7 {

	public static void main(String[] args) {

		// for ~~ 하는 동안
		// 1.초기화 2. 조건식 4.증감식
		for (int i = 1; i <= 10; i++) {
			// 3.수행될 문장
			System.out.println(i);
		}

		System.out.println();

		// 역순 출력 초기값을 10으로 주고 1씩 감소 시킨다.
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// 초기값 변수를 2개 가질 수 있다.
		// 초기값과 증감식은 2개로 맞춰주면 되지만 조건식은 기준 하나만있으면 된다.
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}

		System.out.println();

		// 0 ~ 10까지의 총합을 구하는 방법
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println("총 합: " + sum);

	}

}
