import java.util.Arrays;

public class Ex5_9 {

	public static void main(String[] args) {
		
		// ���̰� �� 45�� �迭 ����
		int[] numArr = new int[45];
		
		// ������Ʈ�� ��ҵ� �ʱ�ȭ �� ����
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(numArr));
		
		// ���� 6��° ������ ����
		for (int i = 0; i < 6; i++) {
			// ���� ����
			int n = (int)(Math.random() * 45);
			// numArr[i]��° ���� ���� tmp�� ����
			int tmp = numArr[i];
			// numArr[n]��°�� ���� numArr[i]��°�� �� ����
			numArr[i] = numArr[n];
			// tmp�� num[n]��°�ǰ��� ���� 
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}
		
		// index 0 ~ 5����(���� 6)�� ���
		for (int i = 0; i < 6; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}
	}

}
