package ch04;

public class Student {
	
	int studentId;
	String studentName;
	String address;
	
	// ��ȯ���� ���� �Ű������� �������� �ʴ� �޼���
	public void showStudentInfo() {
		System.out.println(studentId + "�� �л��� �̸��� " + studentName + " �̰�, �ּҴ� " + address + " �Դϴ�.");
	}
	
	// ��ȯ���� ��Ʈ���̰� �Ű������� �������� �ʴ� �޼���
	public String getStudentName() {
		return studentName;
	}
	
	// ��ȯ���� ���� ��Ʈ�� Ÿ���� �Ű������� 1�� �޴� �޼���
	public void setStudentName(String name) {
		studentName = name;
	}

}
