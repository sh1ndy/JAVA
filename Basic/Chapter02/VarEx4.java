
public class VarEx4 {

	public static void main(String[] args) {

		// char Ÿ���� �����ڵ� A ����
		char c = 'A';
		// int Ÿ�Կ� char Ÿ�� c�� ����
		// char < int �̱� ������ ����
		int i = c;
		// i ���
		System.out.println(i); // 65
		
		String str1 = "";
		String str2 = "AB";
		String str3 = "CDE";
		String str4 = str2 + str3;
		
		System.out.println(str1); // 
		System.out.println(str2); // AB
		System.out.println(str3); // CDE
		System.out.println(str4); // ABCDE
		
		System.out.println("" + 7 + 7); // "77"
		System.out.println(7 + 7 + ""); // "14"
		
	}

}
