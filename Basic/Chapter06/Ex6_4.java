import java.util.Arrays;

class MyMath {

	// ��ȯ���� intŸ���̸� �Ű������� 2���� �ް� �� ���� ���Ѱ��� ��ȯ���ִ� ���
	int add(int a, int b) {
		return a + b;
	}

	// ��ȯ���� intŸ���̸� �Ű������� 2���� �ް� �� ���� ���̳ʽ��� ���� ��ȯ���ִ� ���
	int substract(int a, int b) {
		return a - b;
	}

	// ��ȯ���� intŸ���̸� �Ű������� 2���� �ް� �� ���� ���Ѱ��� ��ȯ���ִ� ���
	long multiple(long a, long b) {
		return a * b;
	}

	// ��ȯ���� intŸ���̸� �Ű������� 2���� �ް� �� ���� �������� ��ȯ���ִ� ���
	double divide(int a, int b) {
		return a / b;
	}

	// ��ȯ���� intŸ���̸� �Ű������� �迭�� ���̸�ŭ �ް� ��� ���� ���Ѱ��� ��ȯ���ִ� ���
	int addAll(int[] a) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}

		return total;
	}

	// ��ȯ���� int�迭 �̸� �Ű������� ���� �迭�� �ʱ�ȭ�� ������ ��ȯ���ִ� ���
	int[] addRes() {
		int[] arr = { 10, 20, 30, 40, 50 };
		return arr;
	}

	// �Ű����� 2���� ���߿� ū���� ��ȯ���ִ� �޼���
	int max(int a, int b) {
		return a > b ? a : b;
	}

	// �Ű����� 2���� ���߿� �������� ��ȯ���ִ� �޼���
	int min(int a, int b) {
		return a < b ? a : b;
	}

	// ������ ȣ��
	void printGugudan(int dan) {
		int result = 0;
		if (!(2 <= dan && dan <= 9)) {
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d%n", dan, i, dan * i);
		}

	}
}

public class Ex6_4 {

	public static void main(String[] args) {

		int[] iArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		MyMath mm = new MyMath();
		int addResult = mm.add(20, 10);
		int substractResult = mm.substract(20, 5);
		long multipleResult = mm.multiple(100L, 30L);
		double divideResult = mm.divide(10, 3);
		int addAll = mm.addAll(iArr);
		int[] methodArr = mm.addRes();

		System.out.println("addResult = " + addResult);
		System.out.println("substractResult = " + substractResult);
		System.out.println("multipleResult = " + multipleResult);
		System.out.println("divideResult = " + divideResult);
		System.out.println("addAll = " + addAll);
		System.out.println(Arrays.toString(methodArr));

		// ���� ������ ���ϰ� ȣ�⸸ �Ѵ�.
		System.out.println(mm.max(10, 20)); // 20
		System.out.println(mm.max(30, 20)); // 30
		System.out.println(mm.min(1, 2)); // 1
		System.out.println(mm.min(8, 5)); // 5

		// ������ ȣ��
		mm.printGugudan(9);

	}

}
