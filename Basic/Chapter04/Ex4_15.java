
public class Ex4_15 {

	public static void main(String[] args) {

		// �� �� ���� ����
		int sum = 0;

		// ��� ������ ���� ����
		int i = 0;

		// ���� �ݺ��� ����
		while (true) {
			// sum �� 100���� ũ�� break������ while�� Ż�� �Ѵ�.
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
