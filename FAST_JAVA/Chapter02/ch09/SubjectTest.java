package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student lee = new Student(100, "Lee");
		lee.setKoreaSubject("국어", 100);
		lee.setMathSubject("수학", 90);
		lee.showScoreInfo();
		System.out.println(lee.korea.subjectName);
	}

}
