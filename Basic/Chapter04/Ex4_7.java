
public class Ex4_7 {

	public static void main(String[] args) {

		// for ~~ �ϴ� ����
		// 1.�ʱ�ȭ 2. ���ǽ� 4.������
		for (int i = 1; i <= 10; i++) {
			// 3.����� ����
			System.out.println(i);
		}

		System.out.println();

		// ���� ��� �ʱⰪ�� 10���� �ְ� 1�� ���� ��Ų��.
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// �ʱⰪ ������ 2�� ���� �� �ִ�.
		// �ʱⰪ�� �������� 2���� �����ָ� ������ ���ǽ��� ���� �ϳ��������� �ȴ�.
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}

		System.out.println();

		// 0 ~ 10������ ������ ���ϴ� ���
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println("�� ��: " + sum);

	}

}
