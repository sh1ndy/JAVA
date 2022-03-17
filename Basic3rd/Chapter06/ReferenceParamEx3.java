package exPrimitiveParam;

public class ReferenceParamEx3 {

	public static void main(String[] args) {

		MyMethod mm = new MyMethod();
		
		int[] arr = {3, 2, 1, 5, 4, 6};
		
		mm.printArr(arr); // 배열의 모든 요소를 출력
		mm.sortArr(arr); // 배열을 정렬
		mm.printArr(arr); // 정렬 후 결과를 출력
		System.out.println("sum = " + mm.sumArr(arr));
		
	}

}
