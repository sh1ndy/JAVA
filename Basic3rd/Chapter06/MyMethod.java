package exPrimitiveParam;

public class MyMethod {
	
	void printArr(int[] arr) {
		System.out.print("[");
		
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}
	
	int sumArr(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	void sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
}
