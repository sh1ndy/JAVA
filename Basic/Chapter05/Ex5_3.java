
public class Ex5_3 {

	public static void main(String[] args) {

		// 최대값과 최소값 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0]; // 최대값 기준을 배열의 인덱스0번째로 잡는다.
		int min = score[0]; // 최소값 기준을 배열의 인덱스0번째로 잡는다.
		
		for (int i = 0; i < score.length; i++) {
			// 초기 배열값과 비교해서 크면 변수 max 저장 작으면 변수 min에 저장
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("큰값 : " + max);
		System.out.println("작은 값 : " + min);
		
	}

}
