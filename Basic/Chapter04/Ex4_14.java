import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		// �Է� ���� ���� �ڸ����� ����ϰ� �ڸ����� ������ ���Ͻÿ�

		int num = 0;
		int sum = 0;
		System.out.print("���ڸ� �Է��ϼ���>>(��:12345) ");
		
		// �ܼ�â���� �Է°��� �޴´�.
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		// �Է°��� IntŸ������ �� ��ȯ �Ѵ�.
		num = Integer.parseInt(tmp);
		
		// num�� 0�� �ƴҶ� ���� �ݺ�
		while (num != 0) {
			// sum = sum + num % 10
			sum += num % 10;
			System.out.printf("sum = %3d, num = %d%n", sum, num);
			
			// num = num / 10; num�� 10���� ���� ��
			num /= 10;
		}
		System.out.println("�� �ڸ����� ��: " + sum);
		
	}

}
