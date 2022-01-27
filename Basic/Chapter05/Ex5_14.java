
class Ex5_14 {

	public static void main(String[] args) {
		
		// 학생 5명의 국어, 영어, 수학 각각의 총점을 구하고 각각의 평균을 구하자
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
		
		System.out.println("국어 총점: " + korTotal + ", 국어 평균: " + korAvg);
		System.out.println("영어 총점: " + engTotal + ", 영어 평균: " + engAvg);
		System.out.println("수학 총점: " + mathTotal + ", 수학 평균: " + mathAvg);
		
		
	}

}