package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		// ����Ʈ �����ڷ� ���� ������
		Student studentKim = new Student();
		studentKim.studentNumber = 1001;
		studentKim.studentName = "Kim";
		studentKim.grade = 3;
		String showInfo = studentKim.showStudentInfo();
		System.out.println(showInfo);
		
		// �Ű����� 3���� �޴� ������
		Student studentLee = new Student(1002, "Lee", 2);
		String leeShowInfo = studentLee.showStudentInfo();
		System.out.println(leeShowInfo);
		
	}

}
