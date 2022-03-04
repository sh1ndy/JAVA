
public class Ex4_16 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		// 1씩 더했을때 100은 언제 넘을까?
		while (true) {

			if (sum >= 100) {
				break;
			}

			++i;
			sum += i;

		}

		System.out.println(i + ", " + sum);
	}

}
