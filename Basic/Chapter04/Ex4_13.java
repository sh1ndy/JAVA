
import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {

		// 입력 받은 수의 마지막 자리를 구한다.
		// 입력 받은 수의 마지막 자리의 총합을 구한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(예:12345)");
		String str = scanner.nextLine();
		int inputNum = Integer.parseInt(str);

		// 합을 구할 변수 생성한다.
		int sum = 0;

		// 입력값이 0보다 작아 질 동안 반복한다.
		while (inputNum > 0) {
			// 입력값의 나머지를 구한다음 sum에 저장한다.
			sum += inputNum % 10;

			// 합과 나머지를 출력한다.
			System.out.println("sum = " + sum + ", num % 10 = " + inputNum % 10);

			// 입력값의 10을 나눈 값을 구한다.
			inputNum = inputNum / 10;
		}

		// 총 합을 구한다.
		System.out.println("각 자리의 마지막 수의 총 합: " + sum);

	}

}
