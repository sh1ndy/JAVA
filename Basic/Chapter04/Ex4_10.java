
public class Ex4_10 {

	public static void main(String[] args) {

		/*
		 * 1. �ش� ��� ����ϱ� ********** ********** ********** ********** **********
		 */

		// �� �� ���� ���� �ݺ���
		for (int i = 0; i < 5; i++) {
			// �� ĭ ���� ���� �ݺ���
			for (int j = 0; j < 10; j++) {
				System.out.printf("%c", '*');
			}
			// �� �ٲ�
			System.out.println();
		}

		System.out.println();

		/*
		 * 2. �ش� ��� ����ϱ� * ** *** **** *****
		 * 
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		/*
		 * 3. �ش� ��� ����ϱ� ***** **** *** ** *
		 * 
		 */

		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
