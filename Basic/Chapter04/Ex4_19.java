
public class Ex4_19 {

	public static void main(String[] args) {

		Loop1:
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 5) {
//					break Loop1; //  j 가 5면 전체 for문 탈출
					break; // j 가 5면 가까운 for문 탈출
				}
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		
		
	}

}
