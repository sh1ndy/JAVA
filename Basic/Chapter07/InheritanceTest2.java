// Ŭ�������� ���� ����
// ��������� Object�� ��� ����
class MyPoint2 extends Object {
	int x;
	int y;
}

//compiler�� �ڵ����� extends Object ���� Ŭ������ �������
class Circle2 {
	MyPoint2 m = new MyPoint2();
	int r;
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Circle2 c = new Circle2();
		// Object�� �ִ� toString() �޼��带 ����� �� ����
		// Object Ŭ������ ��� �޾ұ� ������
		System.out.println(c.toString()); // "Circle2@15db9742"
		Circle2 c2 = new Circle2();
		System.out.println(c2); // "Circle2@6d06d69c"

	}

}
