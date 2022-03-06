import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'A', 'B', 'C', 'D' };
		
		// 배열 초기값을 1 부터 하나씩 증가해서 배열의 길이만큼 초기화 시키고 출력해라.
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		
		// 배열의 초기값을 1 ~ 10의 난수로 초기화하고 출력해라
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(iArr2));
		
		// Arrays 클래스를 이용해서 배열을 출력하라
		System.out.println(Arrays.toString(iArr3));
		
		// char배열을 하나씩 출력해라 - 예외적임
		System.out.println(chArr);
		
		// 배열의 주소값을 출력해라
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
	}

}
