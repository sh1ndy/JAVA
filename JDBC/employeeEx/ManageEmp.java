package employeeEx;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class ManageEmp {
	EmpDAO dao = new EmpDAO();
	
	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사번:");
		int empno = sc.nextInt();
		int result = dao.delete_emp(empno);
		if (result == 1) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("사번을 확인하세요.");
		}
	}
	
	void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사번: ");
		int empno = sc.nextInt();
		System.out.println("이름: ");
		String ename = sc.next();
		System.out.println("입사일자");
		String hiredate = sc.next(); // 스트링 형식으로 입력
		System.out.println("급여: ");
		int sal = sc.nextInt();
		
		//Date.valueOf(스트링) 스트링을 날짜형으로 변경
		EmpDTO dto = new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
		dao.insert_emp(dto);
		System.out.println("저장되었습니다.");
	}
	
	void list() {
		List<EmpDTO> items = dao.list_emp();
		System.out.println("사번\t이름\t입사일자\t급여");
		
		for (EmpDTO dto : items) {
			System.out.print(dto.getEmpno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(dto.getSal() + "\n");
			
		}
	}

}
