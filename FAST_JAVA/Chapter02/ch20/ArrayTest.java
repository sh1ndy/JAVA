package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
		// �迭�� ���̸�ŭ 1 ~ n ���� �����Ѵ�.
		for (int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		
		// for each ��
		for (int a : arr) {
			total += a;
		}
		
		System.out.println(total);
		
	}

}
