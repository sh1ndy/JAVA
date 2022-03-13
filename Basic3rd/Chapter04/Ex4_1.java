
public class Ex4_1 {

	public static void main(String[] args) {

		int x = 93;
		
		System.out.printf("90 <= x && x <= 100 = %b%n", 90 <= x && x <= 100); // true
		System.out.printf("x < 0 || x > 100 = %b%n", x < 0 || x > 100); // false
		System.out.printf("x %% 3 == 0 && x %% 2 != 0 = %b%n", x % 3 == 0 && x % 2 != 0); // true
		
		char ch = 'y';
		System.out.printf("ch == 'y' || ch == 'Y' = %b%n" , ch == 'y' || ch == 'Y'); // true
		System.out.printf("ch == ' ' || ch == '\\t' || ch == '\\n' = %b%n", ch == ' ' || ch == '\t' || ch == '\n'); // false
		
		System.out.printf("'A' <= ch && ch <= 'Z' = %b%n", 'A' <= ch && ch <= 'Z'); // false
		System.out.printf("'a' <= ch || ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z'); // true
		System.out.printf("'0' <= ch && ch <= '9' = %b%n", '0' <= ch && ch <= '9'); // false
		
		String str = "yes";
		System.out.printf("str.equals(\"yes\") = %b%n", str.equals("yes"));
	 	System.out.printf("str.equalsIgnoreCase(\"YES\") = %b%n", str.equalsIgnoreCase("YES"));
		
	}

}
