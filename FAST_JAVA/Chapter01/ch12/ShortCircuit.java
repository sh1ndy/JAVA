package ch12;

public class ShortCircuit {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10); // �տ� ���� false�̸� �ڿ� ���� ������ ���� �ʾƼ� i = 2�̴�.
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2
		
		value = ((num1 += 10) < 10) || ((i += 2) < 10);
		System.out.println(value); // true
		System.out.println(num1);
		System.out.println(i);
		
		
		int myNum = 10;
		int yourNum = 20;
		
		boolean flag = ((myNum += 10) < 10) && ((yourNum += 10) > 10);
		System.out.println(flag); // false
		System.out.println(myNum); // 20
		System.out.println(yourNum); // 20;
		
		flag = ((myNum += 10) < 10) || ((yourNum += 10) > 10);
		System.out.println(flag); // true
		System.out.println(myNum); // 30
		System.out.println(yourNum); // 30
		
	}

}
