
public class Ex4_16 {

	public static void main(String[] args) {

		// 0 ~ 10 �����߿��� 3�� ����� ������ ��� �� ����ϱ�

		for (int i = 0; i < 10; i++) {
			// i�� 3���� �������� �������� 0�̵� ��
			if (i % 3 == 0) {
				// �ش� �� ����� �����ϰ� �ݺ����� ��� ����ȴ�.
				continue;
			}
			System.out.println(i);
		}

	}

}
