
class Ex5_14 {

	public static void main(String[] args) {
		
		// �л� 5���� ����, ����, ���� ������ ������ ���ϰ� ������ ����� ������
		int[][] score = {
				{100, 100, 100},
				{60, 40, 70},
				{88, 64, 66},
				{67, 88, 87},
				{44, 50, 79}
		};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		for (int i = 0; i < score.length; i++) {
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
		}
		
		float korAvg = 0.0f;
		float engAvg = 0.0f;
		float mathAvg = 0.0f;
		
		korAvg = (float)korTotal / score[0].length;
		engAvg = (float)engTotal / score[0].length;
		mathAvg = (float)mathTotal / score[0].length;
		
		System.out.println("���� ����: " + korTotal + ", ���� ���: " + korAvg);
		System.out.println("���� ����: " + engTotal + ", ���� ���: " + engAvg);
		System.out.println("���� ����: " + mathTotal + ", ���� ���: " + mathAvg);
		
		
	}

}