package employeeEx;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class ManageEmp {
	EmpDAO dao = new EmpDAO();
	
	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���:");
		int empno = sc.nextInt();
		int result = dao.delete_emp(empno);
		if (result == 1) {
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.out.println("����� Ȯ���ϼ���.");
		}
	}
	
	void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���: ");
		int empno = sc.nextInt();
		System.out.println("�̸�: ");
		String ename = sc.next();
		System.out.println("�Ի�����");
		String hiredate = sc.next(); // ��Ʈ�� �������� �Է�
		System.out.println("�޿�: ");
		int sal = sc.nextInt();
		
		//Date.valueOf(��Ʈ��) ��Ʈ���� ��¥������ ����
		EmpDTO dto = new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
		dao.insert_emp(dto);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	void list() {
		List<EmpDTO> items = dao.list_emp();
		System.out.println("���\t�̸�\t�Ի�����\t�޿�");
		
		for (EmpDTO dto : items) {
			System.out.print(dto.getEmpno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(dto.getSal() + "\n");
			
		}
	}

}
