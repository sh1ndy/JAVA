
public class Ex4_4 {

	public static void main(String[] args) {

		// 학점 등급 표기
		// 90점 이상 - A, 80점 이상 - B, 70점 이상 - C, 60점 이상 - D
		
		int score = 5;
		String grade = "D";
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		}
		
		System.out.printf("학생의 점수는 %d 이고 등급은 %s 학점 입니다.%n", score, grade);
		
	}

}
