package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.setStudentName("±èÀ¯½Å");
		studentKim.studentId = 1000;
		studentKim.address = "¼­¿ï";
		studentKim.showStudentInfo();
		
		Student studentShin = new Student();
		studentShin.studentId = 1001;
		studentShin.studentName = "½Åµ·";
		studentShin.address = "ºÎ»ê";
		studentShin.showStudentInfo();
		
	}

}
