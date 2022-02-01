package ex03;

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

public class Ex6_3 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t1.color = "red";
		t1.power = false;
		t1.channel = 4;
		
		System.out.println("t1의 color : " + t1.color + " 입니다.");
		System.out.println("t1의 power : " + t1.power + " 입니다.");
		System.out.println("t1의 channel :" + t1.channel + " 입니다.");
		
		t2.color = "yellow";
		t2.power = true;
		t2.channel = 5;
		
		System.out.println("t2의 color : " + t2.color + " 입니다.");
		System.out.println("t2의 power : " + t2.power + " 입니다.");
		System.out.println("t2의 channel :" + t2.channel + " 입니다.");
		
		t2.color = "green";
		t2.power = true;
		t2.channel = 11;
		
		System.out.println("t3의 color : " + t3.color + " 입니다.");
		System.out.println("t3의 power : " + t3.power + " 입니다.");
		System.out.println("t3의 channel :" + t3.channel + " 입니다.");
		
		
		
	}

}
