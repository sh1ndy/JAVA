import java.util.Arrays;

public class Ex5_9 {

	public static void main(String[] args) {
		
		// 길이가 총 45인 배열 생성
		int[] numArr = new int[45];
		
		// 엘리멘트의 요소들 초기화 값 설정
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(numArr));
		
		// 길이 6번째 까지만 섞기
		for (int i = 0; i < 6; i++) {
			// 난수 생성
			int n = (int)(Math.random() * 45);
			// numArr[i]번째 값을 변수 tmp에 저장
			int tmp = numArr[i];
			// numArr[n]번째의 값을 numArr[i]번째에 값 저장
			numArr[i] = numArr[n];
			// tmp를 num[n]번째의값에 저장 
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}
		
		// index 0 ~ 5까지(길이 6)개 출력
		for (int i = 0; i < 6; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}
	}

}
