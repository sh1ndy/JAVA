
import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {

		// 2 ~ 9단 까지의 출력을 받아 구구단 출력해보기
		// 단 2 ~ 9 사이의 값이 아닐 경우 잘못된 입력값이라는 내용 출력하기

		Scanner scanner = new Scanner(System.in);

		System.out.println("2 ~ 9단 중에 보고 싶은 단을 입력하세요>> ");
		// 입력값을 문자열로 받는다.
		String num = scanner.nextLine();
		// 문자열 받은것을 int로 형변환 시킨다.
		int dan = Integer.parseInt(num);

		// 1 보다 크고 10 보다 작은 입력값이면 true
		if (1 < dan && dan < 10) {
			// i의 값이 10보다 작을 동안 문장 실행 후 1씩 증가하고 (조건식 false 될 때 까지 반복)
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d%n", dan, i, dan * i);
			}
		} else {
			// 1 보다 크고 10보다 작은 입력값이 아닐 경우 false 해당 문장 실행
			System.out.println("잘못된 입력 값입니다.");
		}

	}

}
