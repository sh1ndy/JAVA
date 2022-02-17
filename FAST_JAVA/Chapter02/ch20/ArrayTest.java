package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
		// 배열의 길이만큼 1 ~ n 까지 저장한다.
		for (int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		
		// for each 문
		for (int a : arr) {
			total += a;
		}
		
		System.out.println(total);
		
	}

}
