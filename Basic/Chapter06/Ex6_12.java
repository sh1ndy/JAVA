package ex12;

class MyMath {
	int x;
	int y;
	
	int add() {
		return x + y;
	}
	
	static int add(int x, int y) {
		return x + y;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {

		// ��ü ���� ���� ��� ����, iv ��� ����
		System.out.println("static method add() = " + MyMath.add(10, 20)); // static �޼��� ȣ��
		
		// ��ü ���� �� ��� ����, iv ���
		MyMath mm = new MyMath();
		mm.x = 30;
		mm.y = 40;
		System.out.println("instance method add() = " + mm.add());	// instance �޼��� ȣ��
		
	}

}
