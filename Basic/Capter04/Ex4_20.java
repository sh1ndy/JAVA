import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		// ù��° ���� ���� �ۼ�
		outer:
		while (true) {
			// �޴��� ���� �ܼ�â ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			// �ܼ� �Է°� tmp ����
			String tmp = scanner.nextLine();
			// int�� Ÿ������ �� ��ȯ
			menu = Integer.parseInt(tmp);
			
			// ���ǹ� ����
			if (menu == 0) {
				// �Է°��� 0 �̸� ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				// �Է°��� 1 ~ 3 ���̰� �ƴ� ��� �޴� �߸� ���� ����ϰ� ��������
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�. (����� 0)");
				continue;
			}
			
			// �ι�° ���� ���� ����
			for (;;) {
				// ����� �� ���� ��� (������� 0, ��ü ���� 99)
				System.out.println("����� ���� �Է��ϼ���. (��� ���� : 0 ��ü ���� : 99)");
				// �Է°� �ް� ��Ʈ�� ����ȯ
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				// �Է°� �� 0 �̸� ���� �ݺ��� Ż��
				if (num == 0) {
					break;
				}
				
				// �Է°��� 99 �� ���α׷� ��ü ����
				if (num == 99) {
					break outer;
				}
				
				// ��� switch - �Է°��� 1 ~ 3 �߿� ����
				switch (menu) {
					// 1 : num * num
					case 1:
						System.out.println("result = " + num * num);
						break;
					// 2 : Math.sqrt(num)
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					// 3: Math.log(num)
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
				}
			}
		}
		System.out.println("���α׷� ����Ǿ����ϴ�.");
		
	}

}
