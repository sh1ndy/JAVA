import java.util.Arrays; // ctrl + shift + o �ڵ����� import �� ����

public class Ex5_4 {

	public static void main(String[] args) {

		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(iArr); // [I@15db9742
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));

	}

}
