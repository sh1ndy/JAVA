package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Kim");
		Student std2 = new Student(100, "Kim");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		System.out.println(std1);
		
		// clone != new 생성자();
		// clone은 iv값이 수정 된 마지막 시점부터 복사가 된다.
		std1.setStudentName("Lee");
		// 복사할 타입으로 똑같이 맞쳐준다.
		Student copyStudent = (Student) std1.clone();
		System.out.println(copyStudent);
		
		copyStudent.setStudentName("TEN");
		System.out.println(copyStudent);
		
	}

}
