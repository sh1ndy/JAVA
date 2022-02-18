package ch14;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수1 >>");
//		int input1 = scanner.nextInt();
//		System.out.println("정수2 >>");
//		int input2 = scanner.nextInt();
//		scanner.nextLine();
//		
//		Calc c = new CompleteCalc();
//		int addResult = c.add(input1, input2);
//		int substractResult = c.substract(input1, input2);
//		int multipleResult = c.multiple(input1, input2);
//		int divideResult = c.divide(input1, input2);
//		
//		
//		c.description();
//		
//		if (c instanceof CompleteCalc) {
//			CompleteCalc cc = (CompleteCalc) c;
//			cc.showInfo();
//		}
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		
	}

}
