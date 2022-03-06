import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {

		// 배열 섞기 배열의 요소의 순서를 반복해서 바꾼다.
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			// 0 ~ 9 까지의 난수로 index 값 설정
			int n = (int) (Math.random() * 10);
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
	}

}
