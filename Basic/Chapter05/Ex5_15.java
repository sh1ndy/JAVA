import java.util.Scanner;

class Ex5_15 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair", "의자"},		// {0, 0} {0, 1}
				{"computer", "컴퓨터"},	// {1, 0} {1, 1}
				{"integer", "정수"}		// {2, 0} {2, 1}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 정답은? %n", i + 1, words[i][0]);
			
			String input = scanner.nextLine();
			
			
			if (input.equals(words[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n", words[i][1]);
			}
			
		}
	}

}