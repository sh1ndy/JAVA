
public class Ex5_3 {

	public static void main(String[] args) {

		// �ִ밪�� �ּҰ� �迭�� ��� �߿��� ���� ū ���� ���� ���� ���� ã�´�.
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0]; // �ִ밪 ������ �迭�� �ε���0��°�� ��´�.
		int min = score[0]; // �ּҰ� ������ �迭�� �ε���0��°�� ��´�.
		
		for (int i = 0; i < score.length; i++) {
			// �ʱ� �迭���� ���ؼ� ũ�� ���� max ���� ������ ���� min�� ����
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("ū�� : " + max);
		System.out.println("���� �� : " + min);
		
	}

}
