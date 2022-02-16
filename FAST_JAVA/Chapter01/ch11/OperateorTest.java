package ch11;

public class OperateorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		int lastScore = ++gameScore; // gameScore += 1;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		int gameScore2 = 150;
		int lastScore2 = gameScore2++;
		System.out.println(lastScore2);
		
		
		
	}

}
