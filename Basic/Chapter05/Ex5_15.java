import java.util.Scanner;

class Ex5_15 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair", "����"},		// {0, 0} {0, 1}
				{"computer", "��ǻ��"},	// {1, 0} {1, 1}
				{"integer", "����"}		// {2, 0} {2, 1}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ������? %n", i + 1, words[i][0]);
			
			String input = scanner.nextLine();
			
			
			if (input.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n", words[i][1]);
			}
			
		}
	}

}