
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score >= 94) {
				grade += "";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score >= 84) {
				grade += "";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score >= 74) {
				grade += "";
			} else {
				grade += "-";
			}
		} else {
			grade = "D";
		}

		System.out.printf("학생의 점수 : %d,점 이고, 학점 : %s%n", score, grade);

	}

}
