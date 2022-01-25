
public class VarEx4 {

	public static void main(String[] args) {

		// char 타읩의 문자코드 A 저장
		char c = 'A';
		// int 타입에 char 타입 c를 저장
		// char < int 이기 때문에 가능
		int i = c;
		// i 출력
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
