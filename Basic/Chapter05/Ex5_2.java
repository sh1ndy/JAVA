
public class Ex5_2 {

	public static void main(String[] args) {

		// 총합과 평균 배열의 모든 요소를 더해서 총합과 평균을 구한다.
		
		int sum = 0; // 총합 초기화
		float avg = 0f; // 평균 초기화 
		
		// 길이가 5인 int배열 생성과 동시에 점수 초기화
		int[] score = { 100, 88, 100, 100, 90 };
		
		for (int i = 0; i < score.length; i++) {
			// 총합 변수에 score[i] 값들을 계속 저장
			sum += score[i];
		}
		
		// 평균을 소수점으로 나눠서 계산해라
		avg = (float) sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
