package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		// 디폴트 생성자로 만든 생성자
		Student studentKim = new Student();
		studentKim.studentNumber = 1001;
		studentKim.studentName = "Kim";
		studentKim.grade = 3;
		String showInfo = studentKim.showStudentInfo();
		System.out.println(showInfo);
		
		// 매개변수 3개를 받는 생성자
		Student studentLee = new Student(1002, "Lee", 2);
		String leeShowInfo = studentLee.showStudentInfo();
		System.out.println(leeShowInfo);
		
	}

}
