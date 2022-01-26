
import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("현재 월을 입력해주세요>> ");
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 계절은 겨울입니다.");
			break;
		default:
			System.out.println("월 을 잘 못입력 하였습니다.");
		}
	}

}
