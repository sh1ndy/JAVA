
public class Ex5_11 {

	public static void main(String[] args) {

		String str = "ABCDEFG";
		System.out.println(str.length()); // ���ڿ��� ���̸� ��ȯ
		char ch = str.charAt(3); // ���ڿ��� �ִ°� �ϳ��� ���� �ö�
		System.out.println(ch);
		
		String tmp = str.substring(1, 4);
		System.out.println(tmp); // �ε��� n ~ n-1 ��ŭ�� ���� ��
		
		char[] ch2 = str.toCharArray();
		System.out.println(ch2); // String�� ĳ���� �迭�� ��ȯ �Ҷ�
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		
	}

}
