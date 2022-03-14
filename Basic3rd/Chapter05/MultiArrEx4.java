import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {

		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"Integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("0%d번) %s의 단어 정답은: > %n", i + 1, words[i][0]);
			String input = scanner.nextLine();
			
			if (input.equals(words[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 정답은 : " + words[i][1] + " 입니다.");
			}
		}
		
	}

}
