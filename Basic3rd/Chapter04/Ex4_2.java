import java.util.Scanner;

public class Ex4_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int menu = 0;
		
		outer:
		while (true) {
			System.out.println("1) 상품목록, 2) 상품 등록, 0) 프로그램 종료");
			input = scanner.nextLine();
			menu = Integer.parseInt(input);
			
			if (menu == 0) {
				break;
			} else if (menu == 2) {
				
				for (;;) {
					System.out.println("1) 이름 수정, 2) 가격 수정, 0) 프로그램 종료, 99) 상품등록 종료");
					input = scanner.nextLine();
					menu = Integer.parseInt(input);
					
					if (menu == 0) {
						break outer;
					} else if (menu == 99) {
						break;
					}
				}
				
			}
			
		}
		
		
	}

}
