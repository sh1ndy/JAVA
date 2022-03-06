
public class Ex5_11 {

	public static void main(String[] args) {

		String str = "ABCDEFG";
		System.out.println(str.length()); // 문자열의 길이를 반환
		char ch = str.charAt(3); // 문자열에 있는것 하나를 가져 올때
		System.out.println(ch);
		
		String tmp = str.substring(1, 4);
		System.out.println(tmp); // 인덱스 n ~ n-1 만큼을 가져 옴
		
		char[] ch2 = str.toCharArray();
		System.out.println(ch2); // String을 캐릭터 배열로 전환 할때
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		
	}

}
