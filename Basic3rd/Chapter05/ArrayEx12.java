
public class ArrayEx12 {

	public static void main(String[] args) {

		String[] names = { "Kim", "Park", "Yi" };
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		
		String temp = names[2]; // 배열 names의 세번째 요소를 temp에 저장
		System.out.println("temp = " + temp);
		names[0] = "Yu"; // 배열 names의 첫번째 요소를 "Yu"로 변경
		for (String s : names) {
			System.out.println(s);
		}
		
	}

}
