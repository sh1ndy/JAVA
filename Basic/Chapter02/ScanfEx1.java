import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // System.in�� ȭ�鿡�� �Է� �������̴�.
		System.out.println("������ �Է����ּ���>>: ");
		int num = scanner.nextInt(); // num�� �Է¹��� ������ �ϳ��� ���� �����Ұ��̴�.
		System.out.println(num);

		// ���پ� �Է� �������� nextLine
		System.out.println("���ڿ��� �Է� �޾� ������ ��ȯ����>>: ");
		String input = scanner.nextLine(); // ���ڿ��� �Է� �޴´�.
		int num1 = Integer.parseInt(input); // ���ڿ��� ���� int�� ����ȯ ��Ų��.
		System.out.println(num1);

	}

}
