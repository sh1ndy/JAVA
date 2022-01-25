import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // System.in은 화면에서 입력 받을것이다.
		System.out.println("정수를 입력해주세요>>: ");
		int num = scanner.nextInt(); // num에 입력받은 정수의 하나의 값을 저장할것이다.
		System.out.println(num);

		// 한줄씩 입력 받을려면 nextLine
		System.out.println("문자열을 입력 받아 정수로 변환해줌>>: ");
		String input = scanner.nextLine(); // 문자열로 입력 받는다.
		int num1 = Integer.parseInt(input); // 문자열을 정수 int로 형변환 시킨다.
		System.out.println(num1);

	}

}
