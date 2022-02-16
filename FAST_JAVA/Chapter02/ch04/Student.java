package ch04;

public class Student {
	
	int studentId;
	String studentName;
	String address;
	
	// 반환값이 없고 매개변수도 존재하지 않는 메서드
	public void showStudentInfo() {
		System.out.println(studentId + "번 학생의 이름은 " + studentName + " 이고, 주소는 " + address + " 입니다.");
	}
	
	// 반환값이 스트링이고 매개변수는 존재하지 않는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 반환값이 없고 스트링 타입의 매개변수를 1개 받는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}

}
