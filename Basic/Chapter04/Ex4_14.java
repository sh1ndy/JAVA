
import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {

		// ������ ��� �Է� ���� ������ ������ ���ߴ� ����

		int input = 0; // ����� �Է°�
		int answer = 0; // ����

		answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer);

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("1�� 100������ ������ �Է��ϼ��� >>");
			input = scanner.nextInt();

			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if (input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		} while (input != answer);

		System.out.println("�����Դϴ�.");

	}

}
