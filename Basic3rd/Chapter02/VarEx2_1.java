
public class VarEx2_1 {
	
	public static void main(String[] args) {
		
		// int type 수를 5개 입력하세요
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		
		System.out.println();
		
		
		// num1과 num4의 숫자를 바꾸세요
		int tmp = 0;
		
		tmp = num1;
		num1 = num5;
		num5 = tmp;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		
	}

}
