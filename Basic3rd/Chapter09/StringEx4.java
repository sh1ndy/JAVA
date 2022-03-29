package study0329;

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // , �������� ¥����
		
		System.out.println(String.join("-", arr)); // - �� ¥���κ��� �ٽ� �����Ѵ�.
		
		StringJoiner sj = new StringJoiner("&", "^", "^");
		for (String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
		
	}

}
