import java.util.Arrays;

public class Ex5_13 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr의 길이만큼 복사
		int[] arr3 = Arrays.copyOf(arr, 3); // arr의 길이 만큼 복사 - 0, 1, 2
		int[] arr4 = Arrays.copyOf(arr, 7); // arr의 길이 만큼 복사 단. 길이가 복사 길이가 초과할 경우 0 으로 채워짐 - 0, 1, 2, 3, 4, 0, 0
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr의 인덱스 n ~ n-1 까지 복사 - 2, 3
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr의 인덱스 n ~ n-1 까지 복사 - 0, 1, 2, 3, 4, 0, 0
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		// Arrays sort 정렬
		int[] iArr = { 0, 2, 3, 5, 1, 4, 6, 8, 9, 7, 10 };
		Arrays.sort(iArr); // 배열을 정렬 반환값 void 없음
		System.out.println(Arrays.toString(iArr));

	}

}
