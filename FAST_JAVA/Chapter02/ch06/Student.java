package ch06;

public class Student {
	// iv 는 자동 초기화.
	int studentNumber;
	String studentName;
	int grade;
	
	// 디폴트 생성자는 항상 생성해주는 것이 좋다.
	Student() {
		
	}
	
	// 매개변수가 3개인 생성자
	Student(int studentNumber, String studentName, int grade) {
		// 매개변수 값을 this.iv 값에 저장한다.
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		String showInfo = studentNumber + "번 학생의 이름은 " + studentName + " 이고, " + grade +"학년 입니다.";
		return showInfo;
	}
}
