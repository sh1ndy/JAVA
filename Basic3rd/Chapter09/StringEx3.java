package study0329;

import java.util.Arrays;

public class StringEx3 {

	public static void main(String[] args) {

		// ���̰� 0�� char�迭�� �����Ѵ�.
		char[] cArr = new char[0]; // char[] cArr = {};�� ����.
		String s = new String(cArr); // String s = new String("");�� ����.
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		String ss = "java.lang.Object";
		int idx1 = ss.lastIndexOf(".");
		int idx2 = ss.indexOf(".");
		System.out.println(idx1);
		System.out.println(idx2);
		
		String sss = "dog,cat,bear";
		String[] sArr = sss.split(",");
		
		for (String arr : sArr) {
			System.out.println(arr);
		}
		
		String s1 = "java.lang.Object";
		String c1 = s1.substring(10);
		String p1 = s1.substring(5, 9);
		
		System.out.println(c1);
		System.out.println(p1);
		
		
	}

}
