import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {

		System.out.print("���� ���� �Է��ϼ���>>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		// ���ǽ� �� boolean ���� �ƴ϶� ������� �޴´�.
		switch (month) {
			// ��� ���� 12, 1, 2 �߿� �ִٸ�
			case 12: case 1: case 2:
				System.out.println("���� ������ �ܿ��Դϴ�.");
				break;
			// ��� ���� 3, 4, 5 �߿� �ִٸ�
			case 3: case 4: case 5:
				System.out.println("���� ������ ���Դϴ�.");
				break;
			// ��� ���� 6, 7, 8 �߿� �ִٸ�
			case 6: case 7: case 8:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			// ��� ���� 9, 10, 11 �߿� �ִٸ�
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�.");
				break;
			// �������� �ʴ� ���� �Է����� ��
			default:
				System.out.println("���� ���� �ʴ� �� �Դϴ�.");
		}
		
	}

}
