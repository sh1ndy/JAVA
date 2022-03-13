import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';
		char opt = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요. > ");
		score = scanner.nextInt();
		
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score < 74) {
				opt = '-';
			}
		} else {
			grade = 'D';
		}
		System.out.printf("학생의 학점은 %c%c점 입니다.", grade, opt);
	}
	
}
