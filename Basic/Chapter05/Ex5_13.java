
class Ex5_13 {

	public static void main(String[] args) {
		
		int sum = 0;
		// 4��3�� 2���� �迭 ����
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		// score.length = ��
		for (int i = 0; i < score.length; i++) {
			// score[i].length = ��
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
			}
		}
		
		System.out.println("sum = " + sum);
		
		
		
	}

}