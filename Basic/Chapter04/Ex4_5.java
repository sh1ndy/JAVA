import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		int score = scanner.nextInt();
		char grade = ' ';
		char opt = ' ';
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <= 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <= 84) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score <= 74) {
				opt = '-';
			}
		}
		
		System.out.printf("�л��� ������ %d ���Դϴ�.%n", score);
		System.out.printf("�л��� ����� %c%c����Դϴ�.%n", grade, opt);
		
	}

}
