import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		// 첫번째 무한 루프 작성
		outer:
		while (true) {
			// 메뉴판 보기 콘솔창 출력
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			// 콘솔 입력값 tmp 저장
			String tmp = scanner.nextLine();
			// int형 타입으로 형 변환
			menu = Integer.parseInt(tmp);
			
			// 조건문 실행
			if (menu == 0) {
				// 입력값이 0 이면 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				// 입력값이 1 ~ 3 사이가 아닐 경우 메뉴 잘못 선택 출력하고 빠져나옴
				System.out.println("메뉴를 잘못 선택하였습니다. (종료는 0)");
				continue;
			}
			
			// 두번째 무한 루프 생성
			for (;;) {
				// 계산할 값 문장 출력 (계산종료 0, 전체 종료 99)
				System.out.println("계산할 값을 입력하세요. (계산 종료 : 0 전체 종료 : 99)");
				// 입력값 받고 인트로 형변환
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				// 입력값 이 0 이면 현재 반복문 탈출
				if (num == 0) {
					break;
				}
				
				// 입력값이 99 면 프로그램 전체 종료
				if (num == 99) {
					break outer;
				}
				
				// 제어문 switch - 입력값이 1 ~ 3 중에 선택
				switch (menu) {
					// 1 : num * num
					case 1:
						System.out.println("result = " + num * num);
						break;
					// 2 : Math.sqrt(num)
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					// 3: Math.log(num)
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
				}
			}
		}
		System.out.println("프로그램 종료되었습니다.");
		
	}

}
