package ch03;

public class FunctionTest {
	
	// ��ȯ���� int ���̸鼭 �Ű����� 2�� �޼���
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// ��ȯ���� void �̰� �Ű����� 1�� �޼���
	static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// ��ȯ���� int �̸� �Ű������� ���� �޼���
	static int calcSum() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int result = add(a, b);
		System.out.println("a + b = " + result);
		
		sayHello("�ȳ��ϼ���");
		
		int total = calcSum();
		System.out.println(total);
		
		
	}

}
