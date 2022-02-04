// 클래스간의 포함 간계
// 명시적으로 Object를 상속 받음
class MyPoint2 extends Object {
	int x;
	int y;
}

//compiler가 자동으로 extends Object 조상 클래스를 상속해줌
class Circle2 {
	MyPoint2 m = new MyPoint2();
	int r;
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Circle2 c = new Circle2();
		// Object에 있는 toString() 메서드를 사용할 수 있음
		// Object 클래스를 상속 받았기 때문에
		System.out.println(c.toString()); // "Circle2@15db9742"
		Circle2 c2 = new Circle2();
		System.out.println(c2); // "Circle2@6d06d69c"

	}

}
