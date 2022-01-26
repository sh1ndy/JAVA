
public class Ex4_18 {

	public static void main(String[] args) {

		// for문에 이름 붙이기
		Loop1: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// j 가 5랑 같아 질때 실행한다.
				if (j == 5) {
					// 이름붙은 break문으로 for 문 전체를 탈출한다.
					break Loop1;
					// break; <- break문은 하나의 반복문 탈출 하기 때문에 중첩일 때는 제일 가까운 for문 만 탈출하게 된다.
				}
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}

	}

}
