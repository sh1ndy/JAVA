
public class Ex5_6 {

	public static void main(String[] args) {
		
		int sum = 0;		// ������ �����ϱ� ���� ����
		float avg = 0f;		// ����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];	// �ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ���Ѵ�.
		}
		
		avg = (float)sum / score.length;	// ������� floatŸ������ ������ ����ȯ
		
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
		
		
	}

}
