package ch06;

public class Student {
	// iv �� �ڵ� �ʱ�ȭ.
	int studentNumber;
	String studentName;
	int grade;
	
	// ����Ʈ �����ڴ� �׻� �������ִ� ���� ����.
	Student() {
		
	}
	
	// �Ű������� 3���� ������
	Student(int studentNumber, String studentName, int grade) {
		// �Ű����� ���� this.iv ���� �����Ѵ�.
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		String showInfo = studentNumber + "�� �л��� �̸��� " + studentName + " �̰�, " + grade +"�г� �Դϴ�.";
		return showInfo;
	}
}
