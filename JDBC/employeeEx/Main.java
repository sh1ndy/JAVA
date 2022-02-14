package employeeEx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ManageEmp emp = new ManageEmp();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴(1.목록, 2:추가, 3.삭제, 0.종료): ");
			int code = sc.nextInt();  //숫자 입력
			
			switch (code) {  //switch(조건식) 정수 or 스트링
			case 0:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);  //프로그램 종료
				break;
			case 1:
				emp.list();
				break;
			case 2:
				emp.insert();
				break;
			case 3:
				emp.delete();
				break;
			}
		}
		
	}

}
