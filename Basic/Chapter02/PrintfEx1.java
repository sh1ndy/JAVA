
public class PrintfEx1 {

	public static void main(String[] args) {

		// �Ǽ��� ������ ���� �������� ���ڸ� �� �ϳ��� �Ҽ������� ����Ͽ����Ѵ�.
		System.out.println(10.0/3);
		
		// printf() -> �ٹٲ� %n�� ���������� �� �ٲ��� �����ϴ�.
		System.out.printf("%d%n", 15);	// 10����
		System.out.printf("%o%n", 15);	// 8����
		System.out.printf("%x%n", 15);	// 16����
		
		// �����ڸ� ���̰� ����ҷ��� #�� �տ� ���δ�.
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		// 10������ 2������ �ٲܷ��� Integer.toBinaryString���� ����Ͽ� �Ѵ�.
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f1 = 123.4567890f;
		System.out.printf("%f%n", f1); // ���е� ������ 7�ڸ� �� ������ ����
		
		double f2 = 123.4567890;
		System.out.printf("%f%n", f2); // double�� ���е��� 15�ڸ� �� ���� ����
		System.out.printf("%e%n", f2); // ���� ����
		
		
	}

}
