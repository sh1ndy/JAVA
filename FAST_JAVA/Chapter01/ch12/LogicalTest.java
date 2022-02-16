package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		boolean flag = (num1 > 0) && (num2 > 0); // true
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0); // false
		System.out.println(flag);
		flag = (num1 < 0) || (num2 > 0); // true
		System.out.println(flag);
		flag = (num1 < 0) || (num2 > 0); // true
		System.out.println(flag);
		flag = !(num1 > 0); 			// false
		System.out.println(flag);
		
	}

}
