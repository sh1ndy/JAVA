import java.util.Arrays;

public class Ex5_12 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = {
				{ 11, 12 },
				{ 21, 22 }
		};
		
		System.out.println(Arrays.toString(arr)); // 1���� �迭 ȣǮ
		System.out.println(Arrays.deepToString(arr2D)); // 2���� �迭 ȣ��
		
		String[][] str2D1 = {
				{ "aaa", "bbb" },
				{ "AAA", "BBB" }
		};
		
		String[][] str2D2 = {
				{ "aaa", "bbb" },
				{ "AAA", "BBB" }
		};
		
		System.out.println(Arrays.equals(str2D1, str2D2)); // false 1���� ���� �� 
		System.out.println(Arrays.deepEquals(str2D1, str2D2)); // true 2���� ���� �� 
	}

}
