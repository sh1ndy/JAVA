package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 1 ~ 100���� ���� �� 3�� ����� ����ϼ���.
		for (int i = 1; i <= 100; i++) {
			// i �� 3���� ������ 0�� �ƴҰ�� ���ǹ��� Ż�� �϶�
			if ((i % 3) != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
