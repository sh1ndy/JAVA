import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		
		// 2���� �迭�� �̿��� ����ܾ� ���߱�
		String[][] words = {
				{ "Apple", "���" },
				{ "Computer", "��ǻ��" },
				{ "Book", "å" }
		};
		
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%s. %s�� ������?>> ", i + 1, words[i][0]);
			String input = scanner.nextLine();
			
			if (input.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
				count++;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ " + words[i][1] + " �Դϴ�.");
			}
		}
		
		System.out.printf("�� : %d���� ��, %d�� ���ƽ��ϴ�.", words.length, count);

	}

}
