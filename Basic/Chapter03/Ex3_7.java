
public class Ex3_7 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 8;
		
		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", x / y, x % y);
		
		String str1 = "ABC";
		String str2 = "ABC";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("ABC");
		String str4 = new String("ABC");
		
		System.out.println(str3 == str4); // ��ü�� ������ ��� false���� false�� ���´� ������ ���� �ּҰ��� �ٸ��⶧�� 9���� �ٽ� ��� ����
		System.out.println(str3.equals(str4)); // true ���ڿ��� equlas�� ���ϴ°��� ����
		
	}

}
