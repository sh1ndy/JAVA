
class Ex5_16 {

	public static void main(String[] args) {
		
		String str = "ABCDEFGH";
		
		// C ��ȯ�ϱ�
		System.out.println(str.charAt(2));  /// C
		
		// substring
		System.out.println(str.substring(1, 4));  /// BCD
		System.out.println(str.substring(1));     /// to �������� �� ������ ����
		System.out.println(str.substring(2, str.length()));		  /// // length ���� ����
		
		// equals
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.equals(str2));
		
	}

}