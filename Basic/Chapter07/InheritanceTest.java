
class Point {
	int x;
	int y;
}

class Circle {
	Point p = new Point();
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.p.x = 10;
		c.p.y = 20;
		c.r = 30;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.p.r = " + c.r);
		
		Circle c2 = new Circle();
		System.out.println(c.toString());
		System.out.println(c2);
		
	}

}
