import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {

		// �� �ٿ� ����
		// ���� 1 ~ 100 ������ ���� �Է¹޴´�.
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer);
		int num = 0;
		
		// ���� �ݺ� do-while - ó���� �ѹ� ������ �����ְ� ���� ��;
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���>> ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			
			if (num < answer) {
				System.out.println("�� ū ���� �Է� �ϼ���.");
			} else if (num > answer) {
				System.out.println("�� ���� �� �Է��ϼ���.");
			}
			
		} while (num != answer);	// �Է°��� ����� �ٸ��� ���� �ݺ�
		
		System.out.println("���� �Դϴ�.");
	}

}
