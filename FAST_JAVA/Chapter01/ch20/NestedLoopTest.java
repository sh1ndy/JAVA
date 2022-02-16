package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d%n", i, j, j * j);
//			}
//		}
		
		int dan = 2;
		int count = 1;
		while (dan < 10) {
			count = 1;
			while (count < 10) {
				System.out.printf("%d x %d = %d%n", dan, count, dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
		
	}

}
