import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("문자를 하나 입력하세요,>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0); // 입력받은 값의 문자열의 0번째 값을 ch에 저
		System.out.println(ch);
		
		if ('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
		
	}

}
