
import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ��� >> ");
		// 3���� ������ �ֿܼ��� �Է� �޴´�.
		String q1 = scanner.nextLine();
		String q2 = scanner.nextLine();
		String q3 = scanner.nextLine();

		// 1 ~ 3�� ������ num�� �����Ѵ�.
		int num = (int) (Math.random() * 3) + 1;

		// ���ǹ� if
		if (num == 1) {
			// num ���� 1�̸� q1�� �ⷫ�Ѵ�.
			System.out.println(q1);
		} else if (num == 2) {
			// num ���� 1�̸� q2�� �ⷫ�Ѵ�.
			System.out.println(q2);
		} else if (num == 3) {
			// num ���� 1�̸� q3�� �ⷫ�Ѵ�.
			System.out.println(q3);
		} else {
			// num ���� 1 ~ 3�� ���� �ƴϸ� ����Ѵ�.
			System.out.println("�ش� ������ �����ϴ�.");
		}

	}

}
