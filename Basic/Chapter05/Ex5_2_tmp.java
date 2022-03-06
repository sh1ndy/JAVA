import java.util.Arrays; // ctrl + shift + o 자동으로 import

public class Ex5_2_tmp {

	public static void main(String[] args) {

		// int타입 배열의 생성과 초기화를 동시에
		int[] iArr = { 100, 20, 30, 40, 50 }; // 길이가 5인 int배열
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
	}

}
