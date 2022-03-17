package exTv;

public class TvTest3 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "번 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "번 입니다.");
		
		t1.channel = 7;
		t2 = t1;  // t1의 참조변수 주소값을 t2c참조 변수에 저장한다.
		System.out.println("t1의 channel값은 " + t1.channel + "번 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "번 입니다.");
		
	}

}
