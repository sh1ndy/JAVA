package study0329;

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // , 기준으로 짜른다
		
		System.out.println(String.join("-", arr)); // - 로 짜른부분을 다시 연결한다.
		
		StringJoiner sj = new StringJoiner("&", "^", "^");
		for (String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
		
	}

}
