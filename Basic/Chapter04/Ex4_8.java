
public class Ex4_8 {

	public static void main(String[] args) {
		
		// i ���� 10���� ������ ���� �ݺ��ϰ� i�� ���� 1�� ���� ���Ѷ�
		System.out.println("========== 1�� ============");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// i ���� 0���� Ŭ�� ���� �ݺ��ϰ� i�� ���� 1�� ���� ���Ѷ�
		System.out.println("========== 2�� ============");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		// i ���� 10���� ���� �� ���� �ݺ��ϰ� i�� ���� 2�� �������Ѷ�
		System.out.println("========== 3�� ============");
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}

		// i ���� 10���� ������ ���� �ݺ��ϰ� i�� ���� 2�� ����� �������Ѷ�
		System.out.println("========== 4�� ============");
		for (int i = 1; i < 10; i *= 2) {
			System.out.println(i);
		}
		
		// i ���� 10���� ������ ���� �ݺ��ϰ� i�� 1������ ��Ű�� j�� ���� 1�� ���ҽ��Ѷ�
		System.out.println("========== 5�� ============");
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
	}

}
