import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {

		// �޴� ���� ���α׷�
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// ���� �ݺ����� �޴��� ��� ������ �� �ְ� ������. �� 0�� ������ ����
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴� (1~3)�� �����ϼ���. (���� : 0)");
			
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			
			// �Է°��� 0�ϰ��
			if (num == 0) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
				// 1�� ~ 3�������� �Է°��� �ƴ� ���
			} else if (!(1 <= num && num <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (���� : 0)");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� " + num + "�� �Դϴ�.");
		}
		
		
	}

}
