
// Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
// 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
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
		Point copy = (Point) original.clone();	// 복제(clone)해서 새로운 객체를 생성
		
		System.out.println(original);
		System.out.println(copy);
		
		System.out.println();
		copy.x = 20;
		
		System.out.println(original);
		System.out.println(copy);
		
	}

}
