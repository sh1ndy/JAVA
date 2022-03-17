package exMyMath2;

public class MyMathTest {

	public static void main(String[] args) {

		// 클래스메서드 호출. 인스턴스 생성없이 호출 가능
		System.out.println("static method");
		System.out.println(MyMath.staticAdd(200L, 100L));
		System.out.println(MyMath.staticSubstract(200L, 100L));
		System.out.println(MyMath.staticMultiply(200L, 100L));
		System.out.println(MyMath.staticDivide(200L, 100L));
		
		System.out.println();
		
		// 인스턴스 매서드 호출. 인스턴스 객체 생성 후 사용 가능
		System.out.println("instance method");
		MyMath mm = new MyMath();
		mm.a = 20;
		mm.b = 10;
		System.out.println(mm.add(mm.a, mm.b));
		System.out.println(mm.substract(mm.a, mm.b));
		System.out.println(mm.multiply(mm.a, mm.b));
		System.out.println(mm.divide(mm.a, mm.b));
		
	}

}
