
public class Ex4_18 {

	public static void main(String[] args) {

		// for���� �̸� ���̱�
		Loop1: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// j �� 5�� ���� ���� �����Ѵ�.
				if (j == 5) {
					// �̸����� break������ for �� ��ü�� Ż���Ѵ�.
					break Loop1;
					// break; <- break���� �ϳ��� �ݺ��� Ż�� �ϱ� ������ ��ø�� ���� ���� ����� for�� �� Ż���ϰ� �ȴ�.
				}
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}

	}

}
