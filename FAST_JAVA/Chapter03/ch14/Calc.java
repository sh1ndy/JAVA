package ch14;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiple(int num1, int num2);
	int divide(int num1, int num2);
	
	// default �޼���� ������ �����ϴ�.
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for (int a : arr) {
			total += a;
		}
		
		return total;
	}

}
