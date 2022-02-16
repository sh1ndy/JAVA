package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		byte bNum = 125;
		int iNum = bNum;
		System.out.println(iNum); // 작은 타입에서 큰 타입으로는 자동 형변환이 가능하다.
		
		int iNum2 = 125;
		byte bNum2 = (byte) iNum2; // 큰 타입에서 작은 타입에 저장할 경우 강제 타입캐스팅 해줘야한다.
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int iNum3 = (int) dNum;
		System.out.println(iNum3); // 실수가 정수보다 더 큰 값을 가지고있다.
		
		double dNum4 = 1.2;
		float fNum = 0.9f;
		System.out.println();
		int iNum5 = (int) dNum4 + (int) fNum; // dNum4과 fNum을 각각 int형으로 변환 후 + 연산을 진행
		int iNum6 = (int) (dNum4 + fNum); // dNum4 + fNum 연산한 값을 int형으로 형변환
		System.out.println(iNum5);
		System.out.println(iNum6);
		
		int myNum = 10;
		int yourNum = 20;
		myNum += yourNum; // 대입 연산자 myNum = myNum + yourNum
		System.out.println(myNum);
		
	}

}
