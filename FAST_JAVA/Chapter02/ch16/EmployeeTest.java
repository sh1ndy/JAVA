package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee("Edward");
		Employee p = new Employee("Peris");
		System.out.println(e.getName() + "사원의 사번은 " + e.serialNum + "번 입니다.");
		System.out.println(p.getName() + "사원의 사번은 " + p.serialNum + "번 입니다.");
	}

}
