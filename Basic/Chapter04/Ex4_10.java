
public class Ex4_10 {

	public static void main(String[] args) {

		/*
		 * 1. 해당 모양 출력하기 ********** ********** ********** ********** **********
		 */

		// 몇 줄 할지 정한 반복문
		for (int i = 0; i < 5; i++) {
			// 몇 칸 할지 정한 반복문
			for (int j = 0; j < 10; j++) {
				System.out.printf("%c", '*');
			}
			// 줄 바꿈
			System.out.println();
		}

		System.out.println();

		/*
		 * 2. 해당 모양 출력하기 * ** *** **** *****
		 * 
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		/*
		 * 3. 해당 모양 출력하기 ***** **** *** ** *
		 * 
		 */

		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
