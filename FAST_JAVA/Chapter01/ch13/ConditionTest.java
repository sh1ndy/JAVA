package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수1>> ");
		int x = scanner.nextInt();
		System.out.println("정수2>> ");
		int y = scanner.nextInt();
		boolean result = x > y ? true : false;
		System.out.println(result);
		
		System.out.println("정수1>> ");
		int max = scanner.nextInt();
		System.out.println("정수2>> ");
		int min = scanner.nextInt();
		
		int result2 = max > min ? max : min;
		System.out.println(result2);
		
	}

}
