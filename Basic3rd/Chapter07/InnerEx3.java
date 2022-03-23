package day0323;

public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // �ܺ� Ŭ������ private ����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ���� �� �� ����.
//		int siv = outerIv;
		int scv = outerCv;
	}
	
	void myMethod() {
		int iv = 0;
		final int LV = 0; // JDK1.8���� final ���� ����
//		iv = 2;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���� �����ϴ�.
			int iiv3 = iv;	// ����!!! (JDK1.8���� ���� �ƴ�) ���� ������ ������ ����� üũ
			int iiv4 = LV;	// OK
		}
	}

}
