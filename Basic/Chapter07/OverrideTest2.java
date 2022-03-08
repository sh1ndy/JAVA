class MyPoint1 {
	int x;
	int y;
	
	MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}


public class OverrideTest2 {

	public static void main(String[] args) {

		MyPoint1 m = new MyPoint1(5, 3);
		System.out.println(m);
		//System.out.println(m.toString()); // À§¿¡²¨¶û µ¿ÀÏÇÔ
		
	}

}
   