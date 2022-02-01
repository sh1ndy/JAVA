package ex04;

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

public class Ex6_4 {

	public static void main(String[] args) {

		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
		tvArr[0].color = "blue";
		tvArr[0].power = true;
		tvArr[0].channel = 5;
		
		System.out.println("tvArr 객체 배열의 인덱스 0 번째의 color : " + tvArr[0].color + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 0 번째의 power : " + tvArr[0].power + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 0 번째의 channel : " + tvArr[0].channel + " 입니다.");
		
		tvArr[1].color = "orange";
		tvArr[1].power = false;
		tvArr[1].channel = 11;
		
		System.out.println("tvArr 객체 배열의 인덱스 1 번째의 color : " + tvArr[1].color + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 1 번째의 power : " + tvArr[1].power + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 1 번째의 channel : " + tvArr[1].channel + " 입니다.");
		
		tvArr[2].color = "cyan";
		tvArr[2].power = false;
		tvArr[2].channel = 17;
		
		System.out.println("tvArr 객체 배열의 인덱스 2 번째의 color : " + tvArr[2].color + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 2 번째의 power : " + tvArr[2].power + " 입니다.");
		System.out.println("tvArr 객체 배열의 인덱스 2 번째의 channel : " + tvArr[2].channel + " 입니다.");
		
		
		
	}

}
