
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");

		int score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		String grade; // ������ �����ϱ� ���� ����. �ʱⰪ �������� �ʱ�ȭ

		if (score >= 90) {
			// score�� 90���� ũ�ų� ������
			grade = "A";
		} else if (score >= 80) {
			// score�� 80���� ũ�ų� ������
			grade = "B";
		} else if (score >= 70) {
			// score�� 70���� ũ�ų� ������
			grade = "C";
		} else {
			// ��������
			grade = "D";
		}
		System.out.printf("�л��� ������ %d�� �̰�, ������ %s �Դϴ�.", score, grade);

	}

}
