
public class Ex4_19 {

	public static void main(String[] args) {

		Loop1:
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 5) {
//					break Loop1; //  j �� 5�� ��ü for�� Ż��
					break; // j �� 5�� ����� for�� Ż��
				}
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		
		
	}

}
