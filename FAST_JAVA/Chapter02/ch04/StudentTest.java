package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.setStudentName("������");
		studentKim.studentId = 1000;
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		Student studentShin = new Student();
		studentShin.studentId = 1001;
		studentShin.studentName = "�ŵ�";
		studentShin.address = "�λ�";
		studentShin.showStudentInfo();
		
	}

}
