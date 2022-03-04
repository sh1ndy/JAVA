import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {

		// 메뉴 선택 프로그램
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// 무한 반복으로 메뉴를 계속 선택할 수 있게 만들어라. 단 0을 누를시 종료
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴 (1~3)를 선택하세요. (종료 : 0)");
			
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			
			// 입력값이 0일경우
			if (num == 0) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
				// 1번 ~ 3번까지의 입력값이 아닐 경우
			} else if (!(1 <= num && num <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + num + "번 입니다.");
		}
		
		
	}

}
