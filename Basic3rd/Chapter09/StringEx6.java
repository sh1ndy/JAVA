package study0329;

public class StringEx6 {

	public static void main(String[] args) {

		int iVal = 100;
		String strVal = String.valueOf(iVal); // int�� String���� ��ȯ�ϴ�.
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // String���� ��ȯ�ϴ� �� �ٸ� ���
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
		
	}

}
