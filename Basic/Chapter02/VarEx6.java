
public class VarEx6 {

	public static void main(String[] args) {

		String str = "3";
		
		System.out.println((str.charAt(0) - '0') + 15); // 문자 -> 숫자로 바꿀때는 문자 - 문자 하면 숫자로 변환된다.
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt(str) + 6);
		System.out.println("3" + 1);
		System.out.println(3 + '0');
		
	}

}
