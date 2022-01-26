
public class Ex4_12 {

	public static void main(String[] args) {

		// i가 몇번을 더해야지 합계 100이 넘는지 확인
		int i = 0;
		int sum = 0;

		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
