
import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {

		// �Է� ���� ���� ������ �ڸ��� ���Ѵ�.
		// �Է� ���� ���� ������ �ڸ��� ������ ���Ѵ�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(��:12345)");
		String str = scanner.nextLine();
		int inputNum = Integer.parseInt(str);

		// ���� ���� ���� �����Ѵ�.
		int sum = 0;

		// �Է°��� 0���� �۾� �� ���� �ݺ��Ѵ�.
		while (inputNum > 0) {
			// �Է°��� �������� ���Ѵ��� sum�� �����Ѵ�.
			sum += inputNum % 10;

			// �հ� �������� ����Ѵ�.
			System.out.println("sum = " + sum + ", num % 10 = " + inputNum % 10);

			// �Է°��� 10�� ���� ���� ���Ѵ�.
			inputNum = inputNum / 10;
		}

		// �� ���� ���Ѵ�.
		System.out.println("�� �ڸ��� ������ ���� �� ��: " + sum);

	}

}
