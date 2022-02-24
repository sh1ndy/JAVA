package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (num1, num2) -> num1 > num2 ? num1 : num2;
		int result = myNumber.getMax(50, 80);
		System.out.println(result);
	}

}
