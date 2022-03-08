
// Tv 객체 생성
class Tv {
	// 객체의 속성
	String color;
	boolean power;
	int channel;
	
	// 객체의 기능
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}


public class Ex6_1 {

	public static void main(String[] args) {
		
		// Tv인스턴스를 참조하기 위한 참조변수 선언 및 인스턴스 생성
		Tv t = new Tv();
		// 참조변수 t가 가르키는 Tv인스턴스의 채널 속성 사용
		t.channel = 7;
		// 참조변수 t가 가르키는 Tv인스턴스의 채널다운 기능 사용
		t.channelDown();
		
		System.out.println("현재 채널은 " + t.channel + "번 채널입니다.");
		
	}

}

