package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		byte bNum = 125;
		int iNum = bNum;
		System.out.println(iNum); // ���� Ÿ�Կ��� ū Ÿ�����δ� �ڵ� ����ȯ�� �����ϴ�.
		
		int iNum2 = 125;
		byte bNum2 = (byte) iNum2; // ū Ÿ�Կ��� ���� Ÿ�Կ� ������ ��� ���� Ÿ��ĳ���� ������Ѵ�.
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int iNum3 = (int) dNum;
		System.out.println(iNum3); // �Ǽ��� �������� �� ū ���� �������ִ�.
		
		double dNum4 = 1.2;
		float fNum = 0.9f;
		System.out.println();
		int iNum5 = (int) dNum4 + (int) fNum; // dNum4�� fNum�� ���� int������ ��ȯ �� + ������ ����
		int iNum6 = (int) (dNum4 + fNum); // dNum4 + fNum ������ ���� int������ ����ȯ
		System.out.println(iNum5);
		System.out.println(iNum6);
		
		int myNum = 10;
		int yourNum = 20;
		myNum += yourNum; // ���� ������ myNum = myNum + yourNum
		System.out.println(myNum);
		
	}

}
