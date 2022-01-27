
class Ex5_12 {

	public static void main(String[] args) {
		
		// 4행3열 2차원 배열 생성
		int[][] arr = new int[4][3];
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("score[" + i + "] [" + j + "] = " + score[i][j]);
			}
		}
		
		
		
	}

}