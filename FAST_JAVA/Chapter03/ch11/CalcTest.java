package ch11;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수1 >>");
		int input1 = scanner.nextInt();
		System.out.println("정수2 >>");
		int input2 = scanner.nextInt();
		scanner.nextLine();
		
		Calc c = new CompleteCalc();
		int addResult = c.add(input1, input2);
		int substractResult = c.substract(input1, input2);
		int multipleResult = c.multiple(input1, input2);
		int divideResult = c.divide(input1, input2);
		
		
		int[] resultList = {addResult, substractResult, multipleResult, divideResult};
		
		for (int i = 0; i < resultList.length; i++) {
			System.out.println(resultList[i]);
		}
		
		if (c instanceof CompleteCalc) {
			CompleteCalc cc = (CompleteCalc) c;
			cc.showInfo();
		}
		
	}

}
