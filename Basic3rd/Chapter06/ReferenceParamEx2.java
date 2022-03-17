package exPrimitiveParam;

public class ReferenceParamEx2 {

	public static void main(String[] args) {

		Data d = new Data();
		
		int[] x = {10}; // 크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		d.change3(x);
		System.out.println("main() : x = " + x[0]);
		
		int[] iArr = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		d.change3(iArr);
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
	}

}
