import java.util.Arrays;

class Ex5_17 {

	public static void main(String[] args) {
		
		// 출력
		int[] arr= {0, 1, 2, 3, 4, 5};
		int[][] arr2D = {
				{11, 12},
				{21, 22}
		};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		
		// equals 같은지
		String[][] str2D = {
				{"aaa", "bbb"},
				{"AAA", "BBB"},
		};
		
		String[][] str2D2 = {
				{"aaa", "bbb"},
				{"AAA", "BBB"},
		};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// 처음부터 ~ 원하는 길이 횟수 까지
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr4));
		
		// from ~ to 복사
		int[] arr5 = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arr5));
		
		// 정렬
		int[] arrList = {5, 1, 3, 8, 4, 10};
		Arrays.sort(arrList);
		System.out.println(Arrays.toString(arrList));
		
	}

}