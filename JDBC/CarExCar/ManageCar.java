package jdbc;

import java.util.List;
import java.util.Scanner;

public class ManageCar {

	CarDAO dao = new CarDAO(); // 프로퍼티 변수, 필드 변수, 멤버 변수(공용으로 사용)

	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량번호: ");
		String license_number = sc.nextLine(); // 스트링 한 라인
		int result = dao.delete_car(license_number);

		if (result == 1) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("차량번호를 확인하세요");
		}
	}

	void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량번호:");
		String car_no = sc.nextLine();
		System.out.println("제조사:");
		String company = sc.nextLine();
		System.out.println("타입:");
		String type = sc.nextLine();
		System.out.println("제조연도:");
		int year = sc.nextInt();
		System.out.println("연비:");
		int efficiency = sc.nextInt();

		CarDTO dto = new CarDTO(car_no, company, type, year, efficiency);
		dao.insert_car(dto);
		System.out.println("추가되었습니다.");
	}

	void list() {
		List<CarDTO> items = dao.list_car();
		System.out.println("차량번호\t\t\t연도\t제조사\t타입\t연비");
		System.out.println("===================================================");

		for (CarDTO dto : items) {
			System.out.print(dto.getCar_no() + "\t\t");
			System.out.print(dto.getYear() + "\t");
			System.out.print(dto.getCompany() + "\t");
			System.out.print(dto.getType() + "\t");
			System.out.print(dto.getEfficiency() + "\n");
		}
	}

}
