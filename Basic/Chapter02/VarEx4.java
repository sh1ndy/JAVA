
public class VarEx4 {

	public static void main(String[] args) {
		// boolean �ʱⰪ - false
		boolean bool = false;
		System.out.println(bool);
		
		// byte = -128 ~ 127
		byte b = 127;
		System.out.println(b);
		
		// ���λ� 0 - 8����, 10������ 8
		System.out.println(010);
		// ���λ� 0x - 16����, 10������ 16
		System.out.println(0x10);
		
		// Ÿ���� ������ �����Ÿ� ū�ſ� ������ ���� ���̻� ���� ����
		long l1 = 1_000_000_000;
		System.out.println(l1);
		// ������ ����� ���̻縦 �ٿ� ����Ѵ�.
		long l2 = 10_000_000_000L;
		System.out.println(l2);
		
		// �Ǽ�(float) ���ͷ��� ���̻縦 �ٿ�����Ѵ�.
		float f = 3.14f;
		System.out.println(f);
		// �Ǽ� (double) ���������� ���̻簡 �ʿ����. �Ǽ��� �⺻���� doubleŸ���̴�.
		double d = 3.14;
		System.out.println(d);
		
		// �Ҽ��� �� �� �ڸ����� ���U �����ϴ�.
		System.out.println(10.);
		System.out.println(.10);

	}

}
