
class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class MyPoint3D extends Point {
	int r;

	MyPoint3D(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	// 조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:" + x + ", y:" + y + ", r:" + r;
	}

}

public class OverrideTest {

	public static void main(String[] args) {

		MyPoint3D mp = new MyPoint3D(4, 5, 6);

		System.out.println(mp.getLocation());

	}

}
