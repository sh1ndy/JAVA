
public class Ex5_9 {

	public static void main(String[] args) {
		// ���� ������ ���ϰ� ������ ��� ��� ����
		int[][] score = {
				{ 81, 32, 65 },
				{ 87, 35, 59 },
				{ 33, 56, 44 },
				{ 22, 33, 44 },
				{ 50, 50, 50 }
		};
		
		
		// ���� ��÷
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		// ���κ� ����
		int sum = 0;
		float avg = 0f;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("===============================================");
		
		for (int i = 0; i < score.length; i++) {
			
			System.out.printf("%d", i + 1);
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("\t%d", score[i][j]);
				sum += score[i][j];
			}
			
			System.out.printf("\t%d", sum);
			avg = (float) sum / score[i].length;
			System.out.printf("\t%.1f", avg);
			System.out.println();
			sum = 0;
		}
		
		for (int i = 0; i < score.length; i++) {
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
		}
		System.out.println("===============================================");
		System.out.println("���� :   " + korTotal + "     " + engTotal + "     " + mathTotal);
		

	}

}
