abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos + "채널부터 재생 합니다.");
		
	}

	@Override
	void stop() {
		System.out.println("재생을 멈춥니다.");
		
	}
	
}


public class PlayerTest {

	public static void main(String[] args) {

		Player ap = new AudioPlayer();	// 다형형
		ap.play(100);
		ap.stop();
		
	}

}
