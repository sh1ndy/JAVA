package ch01;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		int iNum = 300;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingTest() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
	}
	
	
}

public class InnerTest {

	public static void main(String[] args) {

//		OutClass outClass = new OutClass();
//		outClass.usingTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		OutClass.InStaticClass.sTest();
	}

}
