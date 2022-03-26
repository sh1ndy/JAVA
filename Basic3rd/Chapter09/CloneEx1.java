
// Cloneable�������̽��� ������ Ŭ���������� clone()�� ȣ���� �� �ִ�.
// �� �������̽��� �������� �ʰ� clone()�� ȣ���ϸ� ���ܰ� �߻��Ѵ�.
class Point implements Cloneable { 
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y; 
 	}
	
	public Object clone() {
		Object obj = null;
		
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		return obj;
		
	}
	
}


public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 3);
		Point copy = (Point) original.clone();	// ����(clone)�ؼ� ���ο� ��ü�� ����
		
		System.out.println(original);
		System.out.println(copy);
		
		System.out.println();
		copy.x = 20;
		
		System.out.println(original);
		System.out.println(copy);
		
	}

}
