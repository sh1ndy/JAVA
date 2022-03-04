import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {

		// 업 다운 게임
		// 난수 1 ~ 100 까지의 수를 입력받는다.
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println(answer);
		int num = 0;
		
		// 무한 반복 do-while - 처음에 한번 무조건 보여주고 싶을 때;
		do {
			System.out.print("1과 100사이의 정수를 입력하세요>> ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			
			if (num < answer) {
				System.out.println("더 큰 값을 입력 하세요.");
			} else if (num > answer) {
				System.out.println("더 작은 값 입력하세요.");
			}
			
		} while (num != answer);	// 입력값이 정답과 다를때 까지 반복
		
		System.out.println("정답 입니다.");
	}

}
