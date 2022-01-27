
class Ex5_16 {

	public static void main(String[] args) {
		
		String str = "ABCDEFGH";
		
		// C 반환하기
		System.out.println(str.charAt(2));  /// C
		
		// substring
		System.out.println(str.substring(1, 4));  /// BCD
		System.out.println(str.substring(1));     /// to 생략가능 맨 마지막 까지
		System.out.println(str.substring(2, str.length()));		  /// // length 길이 까지
		
		// equals
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.equals(str2));
		
	}

}