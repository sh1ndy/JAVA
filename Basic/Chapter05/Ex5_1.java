
public class Ex5_1 {
	
	public static void main(String[] args) {
//		int[] score;  // 1. 배열 score 선언(참조변수)
//		score = new int[5];	//2. 배열의 생성(int저장공간 x 5)
		
		int[] score = new int[5]; // 위에 문장을 한줄로 사용
		score[3] = 100; // 인덱스 3에 100 저장
		
		System.out.println("score[0] ] " + score[0]);
		System.out.println("score[1] ] " + score[1]);
		System.out.println("score[2] ] " + score[2]);
		System.out.println("score[3] ] " + score[3]);
		System.out.println("score[4] ] " + score[4]);
		
		// score[3] 값을 value 에 저장
		int value = score[3];
		System.out.println("value = " + value);
		
		
	}

}
