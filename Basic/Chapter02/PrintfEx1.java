
public class PrintfEx1 {

	public static void main(String[] args) {
		
		// printf() ���� 1-1
		System.out.printf("%d%n", 15); // 10����
		System.out.printf("%#o%n", 15); // 8����
		System.out.printf("%#x%n", 15); // 16����
		System.out.printf("%s%n", Integer.toBinaryString(15));	// 2����
		
		float f = 123.456789f;
		System.out.printf("%f%n", f);	// ���е� 7�ڸ������� ��Ȯ��
		double d = 123.456789;
		System.out.printf("%f%n", d);	// ���е� 15�ڸ����� ��Ȯ��
		
		System.out.printf("%e%n", f);	// �������·� ���
		System.out.printf("%g%n", f);	// �Ҽ��� ���� �����ϰ� ���
		
	}

}
