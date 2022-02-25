import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {

		// 입력값 받아서 콘솔창에 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		int num = scanner.nextInt();
		System.out.println(num);
		scanner.nextLine();
		
		// 라인단위 입력받기
		String input = scanner.nextLine();
		int inputNum = Integer.parseInt(input);
		
		System.out.println(inputNum);
		
	}

}
