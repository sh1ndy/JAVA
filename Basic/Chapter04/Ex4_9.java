
public class Ex4_9 {

	public static void main(String[] args) {

		// ��ø for���� �̿���
		// 2�� ~ 9�ܱ��� ������ ǥ ��� �غ���

		// ���� ���� for �� �ۼ� 2 ~ 9
		for (int i = 2; i < 10; i++) {
			System.out.println(); // ���⸦ ���� �� ���ڿ� ���
			// ������ ���� for �� �ۼ� 1 ~ 9
			for (int j = 1; j < 10; j++) {
				// ������ ���
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}

	}

}
