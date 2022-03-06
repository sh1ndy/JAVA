import java.util.Arrays;

public class Ex5_13 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr�� ���̸�ŭ ����
		int[] arr3 = Arrays.copyOf(arr, 3); // arr�� ���� ��ŭ ���� - 0, 1, 2
		int[] arr4 = Arrays.copyOf(arr, 7); // arr�� ���� ��ŭ ���� ��. ���̰� ���� ���̰� �ʰ��� ��� 0 ���� ä���� - 0, 1, 2, 3, 4, 0, 0
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr�� �ε��� n ~ n-1 ���� ���� - 2, 3
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr�� �ε��� n ~ n-1 ���� ���� - 0, 1, 2, 3, 4, 0, 0
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		// Arrays sort ����
		int[] iArr = { 0, 2, 3, 5, 1, 4, 6, 8, 9, 7, 10 };
		Arrays.sort(iArr); // �迭�� ���� ��ȯ�� void ����
		System.out.println(Arrays.toString(iArr));

	}

}
