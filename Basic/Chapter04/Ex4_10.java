
public class Ex4_10 {

	public static void main(String[] args) {

		// �ݺ����� ���� 1 ~ 10������ ������ ���
		// ���° ��������  ������ �� total�� 30 �Ѵ��� ã�Ƴ�
		
		int total = 0;
		int count = 0;
		
		for (int i = 0; i <= 10; i++) {
			total += i;
			
			if (total <= 30) {
				count++;
			}
		}
		System.out.println("�� �� : " + total);
		System.out.println("ī��Ʈ : " + count);
		
	}

}
