package ex18;

class MyMath {
	int x;	// this.x <-- ��¥ �̸�(���� ����)
	int y;	// this.y <-- ��¥ �̸�(���� ����)
	
	MyMath() {
		// this() ������ ȣ��
		this(30, 40);
	}
	
	// �Ű������� �ִ� ������
	MyMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class Ex6_18 {

	public static void main(String[] args) {
		
		// �⺻ ������
		MyMath mm = new MyMath();
		System.out.println(mm.x);
		System.out.println(mm.y);
		
		// �Ű����� ������
		MyMath mm2 = new MyMath(60, 80);
		System.out.println(mm2.x);
		System.out.println(mm2.y);

	}

}
