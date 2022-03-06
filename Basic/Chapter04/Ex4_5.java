import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요>>");
		int score = scanner.nextInt();
		char grade = ' ';
		char opt = ' ';
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <= 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <= 84) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score <= 74) {
				opt = '-';
			}
		}
		
		System.out.printf("학생의 점수는 %d 점입니다.%n", score);
		System.out.printf("학생의 등급은 %c%c등급입니다.%n", grade, opt);
		
	}

}
