package ch20;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1;
		count++;
		dArr[1] = 2.1;
		count++;
		dArr[2] = 3.1;
		count++;
		
		double total = 1;
		for (int i = 0; i < count; i++) {
			total *= dArr[i];
		}
		System.out.println(total);
		
		char[] cArr = new char[26];
		char alphabet = 65;
		
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = alphabet++;
		}
		
		for (char c : cArr) {
			System.out.println(c + ", " + (int)c);
		}
		
	}

}
