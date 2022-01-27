import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {10, 20, 30, 40, 50};
		char[] chArr = {'a', 'b', 'c', 'b'};
		
		// �迭�� ��Ҹ� 1 ~ 10���� ���
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i< iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
			System.out.print(iArr2[i] + ", ");
		}
		
		System.out.println();
		
		// ���ٿ� ������ ������ ���
		for(int i = 0; i < iArr3.length; i++) {
			System.out.println("iArr3[" + i + "] = " + iArr3[i]);
		}
		
		// Arrays Ŭ������ �̿��ؼ� ���ϰ� ����� �� �ִ�.
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		
		// Arrays�� ������� �ʰ� �׳� ����ϸ� �ּҰ��� ��ȯ �ȴ�.
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
		
		// char type�� �迭�� ��쿡 println�� ������� ���ϰ� ��� �����ϴ�.
		System.out.println(chArr);
		
	}

}
