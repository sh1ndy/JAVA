package exReturn;

import java.util.Arrays;

public class ReturnTest {
	
	public static void main(String[] args) {

		MyReturn r = new MyReturn();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
		int[] numArr1 = new int[] {1, 2, 3, 4, 5};
		int[] numArr2 = new int[] {5, 4, 3, 2, 1};
		int[] numArrResult = new int[5];
		
		r.addAll(numArr1, numArr2, numArrResult);
		
		System.out.println(Arrays.toString(numArrResult));
		
		
		
	}

}
