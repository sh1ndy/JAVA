
public class Ex5_2 {

	public static void main(String[] args) {

		// ���հ� ��� �迭�� ��� ��Ҹ� ���ؼ� ���հ� ����� ���Ѵ�.
		
		int sum = 0; // ���� �ʱ�ȭ
		float avg = 0f; // ��� �ʱ�ȭ 
		
		// ���̰� 5�� int�迭 ������ ���ÿ� ���� �ʱ�ȭ
		int[] score = { 100, 88, 100, 100, 90 };
		
		for (int i = 0; i < score.length; i++) {
			// ���� ������ score[i] ������ ��� ����
			sum += score[i];
		}
		
		// ����� �Ҽ������� ������ ����ض�
		avg = (float) sum / score.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
