
public class Ex5_7 {

	public static void main(String[] args) {
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�.
		
		// �迭�� �� ��° ��Һ��� �б� ���ؼ� ���� i�� ���� 1�� �ʱ�ȭ
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
	}

}
