import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {

		System.out.print("현재 월을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		// 조건식 이 boolean 값이 아니라 결과값을 받는다.
		switch (month) {
			// 결과 값이 12, 1, 2 중에 있다면
			case 12: case 1: case 2:
				System.out.println("현재 계절은 겨울입니다.");
				break;
			// 결과 값이 3, 4, 5 중에 있다면
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			// 결과 값이 6, 7, 8 중에 있다면
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			// 결과 값이 9, 10, 11 중에 있다면
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			// 존재하지 않는 값을 입력했을 시
			default:
				System.out.println("존재 하지 않는 월 입니다.");
		}
		
	}

}
