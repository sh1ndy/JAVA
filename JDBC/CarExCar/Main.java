package jdbc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ManageCar car = new ManageCar();	// 클래스의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		while (true) {	// 무한박복
			System.out.println("작업을 선택하세요(1:목록, 2:추가, 3:삭제, 0:종료): ");
			int code = sc.nextInt();  // 정수 입력
			
			switch (code) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);	// 프로그램 강제 종료
				break;
			case 1:
				car.list();
				break;
			case 2:
				car.insert();
				break;
			case 3:
				car.delete();
				break;
			}
		}
	}

}
