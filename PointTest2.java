
class Point3 {
	int x = 10;
	int y = 20;
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getString() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D2 extends Point3 {
	int r = 30;
	
	Point3D2(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	String getString() {
		return "x : " + x + ", y : " + y + ", r : " + r;
	}
}

public class PointTest2 {

	public static void main(String[] args) {

		Point3D2 p3 = new Point3D2(100, 200, 300);
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.r = " + p3.r);
		
		
	}

}
