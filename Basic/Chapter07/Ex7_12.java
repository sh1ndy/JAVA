
public class Ex7_12 {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;			//  ����! static������ ������ �� ����.
		final static int CONST = 100;	// final static�� ����̹Ƿ� ���
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	// staticŬ������ static����� ������ �� �ִ�.
	}
	
	void method() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;	// ����! static������ ������ �� ����.
			final static int CONST = 300;	// final static�� ����̹Ƿ� ���
		}
		
		int i = LocalInner.CONST;	// OK
	}

	public static void main(String[] args) {

		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
	}

}
