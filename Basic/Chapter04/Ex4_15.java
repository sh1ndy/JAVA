
public class Ex4_15 {

	public static void main(String[] args) {

		// 총 합 구할 변수
		int sum = 0;

		// 몇번 더한지 구할 변수
		int i = 0;

		// 무한 반복문 실행
		while (true) {
			// sum 이 100보다 크면 break문으로 while문 탈출 한다.
			if (sum > 100) {
				break;
			}

			i++;
			sum += i;
		}

		System.out.println("i = " + i);
		System.out.println("sum = " + sum);

	}

}
