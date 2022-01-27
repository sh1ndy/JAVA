import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {10, 20, 30, 40, 50};
		char[] chArr = {'a', 'b', 'c', 'b'};
		
		// 배열의 요소를 1 ~ 10까지 출력
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i< iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;
			System.out.print(iArr2[i] + ", ");
		}
		
		System.out.println();
		
		// 벼앨에 지정된 값들을 출력
		for(int i = 0; i < iArr3.length; i++) {
			System.out.println("iArr3[" + i + "] = " + iArr3[i]);
		}
		
		// Arrays 클래스를 이용해서 편하게 사용할 수 있다.
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		
		// Arrays를 사용하지 않고 그냥 출력하면 주소값이 반환 된다.
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
		
		// char type의 배열일 경우에 println의 기능으로 편하게 출력 가능하다.
		System.out.println(chArr);
		
	}

}
