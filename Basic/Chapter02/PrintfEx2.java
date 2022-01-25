
public class PrintfEx2 {

	public static void main(String[] args) {

		// ���� ���
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%05d]%n", 1234567); // �ڸ��� �ʰ��� ���� ���� �������
		
		// �Ǽ� ���
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d); // ��ü 14�ڸ��� 10�����ڸ� �Ҽ��� ���� ���
		
		// ���ڿ� ���
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // ���ڿ� ����� 20�ڸ� ���� ����
		System.out.printf("[%-20s]%n", url); // ���ڿ� ����� 20�ڸ� ���� ���� (�ݴ��)
		System.out.printf("[%.8s]%n", url); // ó������ ¥������� �ڸ� �� ����
		
		
	}

}
