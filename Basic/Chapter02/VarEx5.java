
public class VarEx5 {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		
		// ����Ÿ���� ������ ���� �����ϸ� �ڵ����� ���������� ������ �ٲ��� ��µȴ�.
		int i = 'Z';
		System.out.println(i);
		
		// ����Ÿ���� ������ ���� �����ϸ� �ڵ����� ���������� ������ �ٲ��� ��µȴ�.
		char c = 90;
		System.out.println(c);
		
		String str = ""; // �� ���ڿ� (empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		// ��Ģ������ ���ʿ��� ���� ���� ���ڿ��� �ϳ��� ��������� ���ڿ��� �ٲ�
		System.out.println("" + 7 + 7); // 77
		System.out.println(7 + 7 + ""); // 14
		
	}

}
