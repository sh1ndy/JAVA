class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	String text;
	
	void caption() {
		System.out.println(text);
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv(); // OK
		Tv t = new SmartTv();		// OK
		
//		SmartTv stv2 = new Tv();	// Error. 

	}

}
