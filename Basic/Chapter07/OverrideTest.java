class MyPoint {
	int x;
	int y;
	
	String getLoctaion() {
		return "x = " + x + ", y = " + y;
	}
}

class Point3D extends MyPoint {
	int r;
	
	// ������ getLocation()�� �������̵�
	String getLoctaion() {
		return "x = " + x + ", y = " + y + ", r = " + r;
	}
}

public class OverrideTest {

	public static void main(String[] args) {

		Point3D p = new Point3D();
		p.x = 10;
		p.y = 20;
		p.r = 30;
		
		System.out.println(p.getLoctaion());
		
	}

}
