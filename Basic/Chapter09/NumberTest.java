
public class NumberTest {

	public static void main(String[] args) {

		System.out.println("i = " + Integer.parseInt("100"));
		System.out.println("i = " + Integer.parseInt("100", 2));
		System.out.println("i = " + Integer.parseInt("100", 8));
		System.out.println("i = " + Integer.parseInt("100", 16));
		System.out.println("i = " + Integer.parseInt("FF", 16));
//		System.out.println("i = " + Integer.parseInt("FF")); // 10�������� FF�� �������� ����
		
	}

}
