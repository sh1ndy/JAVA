
import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {

		// 2 ~ 9�� ������ ����� �޾� ������ ����غ���
		// �� 2 ~ 9 ������ ���� �ƴ� ��� �߸��� �Է°��̶�� ���� ����ϱ�

		Scanner scanner = new Scanner(System.in);

		System.out.println("2 ~ 9�� �߿� ���� ���� ���� �Է��ϼ���>> ");
		// �Է°��� ���ڿ��� �޴´�.
		String num = scanner.nextLine();
		// ���ڿ� �������� int�� ����ȯ ��Ų��.
		int dan = Integer.parseInt(num);

		// 1 ���� ũ�� 10 ���� ���� �Է°��̸� true
		if (1 < dan && dan < 10) {
			// i�� ���� 10���� ���� ���� ���� ���� �� 1�� �����ϰ� (���ǽ� false �� �� ���� �ݺ�)
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d%n", dan, i, dan * i);
			}
		} else {
			// 1 ���� ũ�� 10���� ���� �Է°��� �ƴ� ��� false �ش� ���� ����
			System.out.println("�߸��� �Է� ���Դϴ�.");
		}

	}

}
