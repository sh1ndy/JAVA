
import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1) square");
			System.out.println("2) square root");
			System.out.println("3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �������ּ���.(����: 0)");

			String tmp = scanner.nextLine();
			int input = Integer.parseInt(tmp);

			if (input == 0) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
			} else if (!(1 <= input && input <= 3)) {
				System.out.println("�޴��� �߸� �����߽��ϴ�.(����: 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� " + input + "�� �Դϴ�.");
		}

	}

}
