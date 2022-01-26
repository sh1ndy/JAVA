
public class Ex3_7 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
		
		String str1 = "ABC";
		String str2 = "ABC";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("ABC");
		String str4 = new String("ABC");
		
		System.out.println(str3 == str4); // 객체를 생성할 경우 false값이 false가 나온다 이유는 참조 주소값이 다르기때문 9장쯤 다시 배울 예정
		System.out.println(str3.equals(str4)); // true 문자열은 equlas로 비교하는것이 좋다
		
	}

}
