package ch12;

public class ShortCircuit {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10); // 앞에 값이 false이면 뒤에 값은 연산을 하지 않아서 i = 2이다.
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
