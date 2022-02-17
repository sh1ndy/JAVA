package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");

		studentLee.addSubject("국어", 50);
		studentLee.addSubject("수학", 20);

		Student studentKim = new Student(1001, "Kim");

		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 20);
		studentKim.addSubject("영어", 40);

		studentLee.showScoreInfo();
		System.out.println("=====================");
		studentKim.showScoreInfo();

	}

}
