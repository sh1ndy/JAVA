package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addCalc = (x, y) ->  x + y;
		int result = addCalc.add(20, 20);
		System.out.println(result);
		
	}

}
