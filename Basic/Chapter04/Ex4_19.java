
import java.util.Scanner;

public class Ex4_19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int num = 0;

		outer: while (true) {
			System.out.println("1) square");
			System.out.println("2) square root");
			System.out.println("3) log");
			System.out.println("원하는 메뉴(1~3)를 선택해주세요.(종료: 0)");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
//				System.out.println("프로그램을 종료하겠습니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택했습니다.(종료: 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");

			for (;;) {
				System.out.println("계산할 값을 입력하세요. (계산 종료: 0, 전체 종료: 99) >>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0) {
					break;
				}

				if (num == 99) {
					break outer;
				}

				switch (menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result = " + Math.log(num));
					break;
				}

			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
