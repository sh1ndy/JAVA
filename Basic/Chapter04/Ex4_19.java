
import java.util.Scanner;

public class Ex4_19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int num = 0;

		outer: while (true) {
			System.out.println("1) square");
			System.out.println("2) square root");
			System.out.println("3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �������ּ���.(����: 0)");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
//				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����߽��ϴ�.(����: 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� " + menu + "�� �Դϴ�.");

			for (;;) {
				System.out.println("����� ���� �Է��ϼ���. (��� ����: 0, ��ü ����: 99) >>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0) {
					break;
				}

				if (num == 99) {
					break outer;
				}

				switch (menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result = " + Math.log(num));
					break;
				}

			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
