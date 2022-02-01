package ex02;

class Tv {
	// Tv의 속성(멤버 변수)
	String color;	// 색상
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	// Tv의 기능(메서드)
	void power() {
		// Tv를 켜거나 끄는 기능을 하는 메서드
		power = !power;
	}
	
	void channelUp() {
		// Tv의 채널을 높이는 기능을 하는 메서드
		++channel;
	}
	
	void channelDown() {
		// Tv의 채널을 낮추는 기능을 하는 메서드
		--channel;
	}
	
}

public class Ex6_2 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");	// t1.channel = 0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");	// t2.channel = 0
		
		// t1.channel의 멤버변수에 6으로 변경
		t1.channel = 6;
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");	// t1.channel = 6
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");	// t2.channel = 0
		
		// 참조변수 t1의 값을 t2에 저장
		t2 = t1;
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");	// t1.channel = 6
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");	// t2.channel = 6
		
		
		
	}

}
