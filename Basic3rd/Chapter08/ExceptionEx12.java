
public class ExceptionEx12 {

	public static void main(String[] args) throws Exception {
		method1();  // ���� Ŭ������ static����̹Ƿ� ��ü�������� ���� ȣ�� ����
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

}
