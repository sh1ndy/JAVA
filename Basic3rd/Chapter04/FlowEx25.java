import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {

//		int num = 0;
//		int sum = 0;
//		
//		System.out.print("숫자를 입력하세요. (예:12345) > ");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while (num != 0) {
//			// num을 10으로 나눈 뒤 sum에 더
//			sum += num % 10;
//			System.out.printf("sum = %3d num = %d%n", sum, num);
//			
//			num /= 10; // num을 10으로 나눈 값을 다시 num에 저장
//		}
//		System.out.println("각 자리수의 합: " + sum);
		
		
		System.out.print("금액을 입력하세요, (예:43210) > ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int money = Integer.parseInt(tmp);
		
		int won500 = 0;
		int won100 = 0;
		int won50 = 0;
		int won10 = 0;
		
		while (money != 0) {
			won500 = money / 500;
			money %= 500;
			
			won100 = money / 100;
			money %= 100;
			
			won50 = money / 50;
			money %= 50;
			
			won10 = money / 10;
			money %= 10;
		}
		
		System.out.println("500원의 개수: " + won500);
		System.out.println("100원의 개수: " + won100);
		System.out.println("50원의 개수: " + won50);
		System.out.println("10원의 개수: " + won10);
		
	}

}
