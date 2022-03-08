
class Tv {
	int channel;
	boolean power;
	
	void channelUp() {
		++channel;
	}
}

class SmartTv extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if (caption != false) {
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {

		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.caption = true;
		
		stv.displayCaption("æ»≥Á«œººø‰ ¡÷¿Œ¥‘!");
		
		
	}

}
