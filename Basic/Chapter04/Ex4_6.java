
import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("질문 3개를 입력하세요 >> ");
		// 3개의 질문을 콘솔에서 입력 받는다.
		String q1 = scanner.nextLine();
		String q2 = scanner.nextLine();
		String q3 = scanner.nextLine();

		// 1 ~ 3의 난수를 num에 대입한다.
		int num = (int) (Math.random() * 3) + 1;

		// 조건문 if
		if (num == 1) {
			// num 값이 1이면 q1을 출략한다.
			System.out.println(q1);
		} else if (num == 2) {
			// num 값이 1이면 q2을 출략한다.
			System.out.println(q2);
		} else if (num == 3) {
			// num 값이 1이면 q3을 출략한다.
			System.out.println(q3);
		} else {
			// num 값이 1 ~ 3의 값이 아니면 출력한다.
			System.out.println("해당 질문은 없습니다.");
		}

	}

}
