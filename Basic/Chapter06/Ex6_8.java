package ex08;

class MyMath {
	// ��ȯ Ÿ���� void�� ���
	void printGugudan(int dan) {
		// 2 ~ 9 ������ �Ű������� ������ ���� �������� ���
		if (2 <= dan && dan < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d%n", dan, i, dan * i);
			}
		} else {
			return; // �Է� ���� ���� 2 ~ 9�� �ƴϸ�, �޼��� �����ϰ� ���Ʊ��
		}
	}
	
	// ��ȯ Ÿ���� �ִ� ���
	long max(long a, long b) {	// �� ���� �޾Ƽ� �� �߿� ū���� ��ȯ�� �ִ� �޼���
		if (a > b) {
			return a;	// ���ǽ��� ���϶��� ����
		} else {
			return b;	// ���ǽ��� ������ �� ����
		}
	}
}

public class Ex6_8 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		mm.printGugudan(9);
		System.out.println("max(a, b) = " + mm.max(7L, 10L));

	}

}
