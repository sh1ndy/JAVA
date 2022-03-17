package exReturn;

public class MyReturn {
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}
	
	void addAll(int[] num1, int[] num2, int[] result) {
		
		for (int i = 0; i < result.length; i++) {
			result[i] = num1[i] + num2[i];
		}
	}

}
