
import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1) square");
			System.out.println("2) square root");
			System.out.println("3) log");
			System.out.println("원하는 메뉴(1~3)를 선택해주세요.(종료: 0)");

			String tmp = scanner.nextLine();
			int input = Integer.parseInt(tmp);

			if (input == 0) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			} else if (!(1 <= input && input <= 3)) {
				System.out.println("메뉴를 잘못 선택했습니다.(종료: 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + input + "번 입니다.");
		}

	}

}
