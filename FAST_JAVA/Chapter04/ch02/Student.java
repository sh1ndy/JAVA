package ch02;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;

	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}

	@Override
	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.studentNum == student.studentNum) {
				return true;
			}
		}
		return false;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
