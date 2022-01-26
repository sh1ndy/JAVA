
public class Ex4_11 {

	public static void main(String[] args) {

		// 0 ~ 5미만 반복해서 출력하라.
		// 초기화
		int i = 0;

		// 조건식
		while (i < 5) {
			System.out.println(i + " -I can do it.");
			// 증감식
			i++;
		}

		System.out.println("===== 역순 =====");
		int j = 5;
		while (j != 0) {
			System.out.println(j + " - I can do it.");
			j--;
		}

	}

}
