import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		// 입력 받은 값의 자리수를 출력하고 자리수의 총합을 구하시오

		int num = 0;
		int sum = 0;
		System.out.print("숫자를 입력하세요>>(예:12345) ");
		
		// 콘솔창에서 입력값을 받는다.
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		// 입력값을 Int타입으로 형 변환 한다.
		num = Integer.parseInt(tmp);
		
		// num이 0이 아닐때 까지 반복
		while (num != 0) {
			// sum = sum + num % 10
			sum += num % 10;
			System.out.printf("sum = %3d, num = %d%n", sum, num);
			
			// num = num / 10; num을 10으로 나눈 값
			num /= 10;
		}
		System.out.println("각 자리수의 합: " + sum);
		
	}

}
