
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");

		int score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장
		String grade; // 학점을 저장하기 위한 변수. 초기값 공백으로 초기화

		if (score >= 90) {
			// score가 90보다 크거나 같으면
			grade = "A";
		} else if (score >= 80) {
			// score가 80보다 크거나 같으면
			grade = "B";
		} else if (score >= 70) {
			// score가 70보다 크거나 같으면
			grade = "C";
		} else {
			// 나머지는
			grade = "D";
		}
		System.out.printf("학생의 점수는 %d점 이고, 학점은 %s 입니다.", score, grade);

	}

}
