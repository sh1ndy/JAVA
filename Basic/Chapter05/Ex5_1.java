import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'A', 'B', 'C', 'D' };
		
		// �迭 �ʱⰪ�� 1 ���� �ϳ��� �����ؼ� �迭�� ���̸�ŭ �ʱ�ȭ ��Ű�� ����ض�.
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		
		// �迭�� �ʱⰪ�� 1 ~ 10�� ������ �ʱ�ȭ�ϰ� ����ض�
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(iArr2));
		
		// Arrays Ŭ������ �̿��ؼ� �迭�� ����϶�
		System.out.println(Arrays.toString(iArr3));
		
		// char�迭�� �ϳ��� ����ض� - ��������
		System.out.println(chArr);
		
		// �迭�� �ּҰ��� ����ض�
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
	}

}
