import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {

		// �Է°� �޾Ƽ� �ܼ�â�� ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		int num = scanner.nextInt();
		System.out.println(num);
		scanner.nextLine();
		
		// ���δ��� �Է¹ޱ�
		String input = scanner.nextLine();
		int inputNum = Integer.parseInt(input);
		
		System.out.println(inputNum);
		
	}

}
