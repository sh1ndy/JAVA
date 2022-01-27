import java.util.Arrays;

public class Ex5_8 {

	public static void main(String[] args) {
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
		char[] chArr = {'a', 'b', 'c', 'b', 'e', 'f', 'g', 'h', 'i', 'j'};
		System.out.println(chArr);
		
		for (int i = 0; i < chArr.length; i++) {
			int n = (int)(Math.random() * 10);
			char tmp = chArr[i];
			chArr[i] = chArr[n];
			chArr[n] = tmp;
		}
		
		System.out.println(chArr);
	}

}
