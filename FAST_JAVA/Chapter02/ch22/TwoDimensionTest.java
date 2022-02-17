package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {

		int[][] row = {
				{1, 2, 3},
				{1, 2, 3, 4},
				{1, 2, 3, 4, 5}
		};
		
		for (int i = 0; i < row.length; i++) {
			for(int j = 0; j < row[i].length; j++) {
				System.out.print(row[i][j] + ", ");
			}
			System.out.println( "....... " + row[i].length);
			System.out.println();
		}
		
		
	}

}
