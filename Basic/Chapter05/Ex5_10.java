import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		
		// 2차원 배열을 이용한 영어단어 맞추기
		String[][] words = {
				{ "Apple", "사과" },
				{ "Computer", "컴퓨터" },
				{ "Book", "책" }
		};
		
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%s. %s의 정답은?>> ", i + 1, words[i][0]);
			String input = scanner.nextLine();
			
			if (input.equals(words[i][1])) {
				System.out.println("정답입니다.");
				count++;
			} else {
				System.out.println("틀렸습니다. 정답은 " + words[i][1] + " 입니다.");
			}
		}
		
		System.out.printf("총 : %d문제 중, %d개 맞쳤습니다.", words.length, count);

	}

}
