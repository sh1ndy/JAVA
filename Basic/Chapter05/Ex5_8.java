
public class Ex5_8 {

	public static void main(String[] args) {
		
		//	2차원 배열을 전체 다 출력하고 총합을 구해라
		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 }
		};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
			}
		}
		
		System.out.println("총점 : " + sum);

	}

}
