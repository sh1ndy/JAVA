
public class Ex4_12 {

	public static void main(String[] args) {

		// i�� ����� ���ؾ��� �հ� 100�� �Ѵ��� Ȯ��
		int i = 0;
		int sum = 0;

		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
