
public class Ex4_13 {

	public static void main(String[] args) {

		// i�� ����� ���ϸ� sum 100�� ������
		int sum = 0;
		int count = 0;
		
		// count�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while (sum <= 100) {
			System.out.printf("%d - %d%n", sum, count);
			sum += ++count;
		}
		
	}

}
