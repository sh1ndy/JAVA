package day0323;

interface II {
	void play();
}

class AAA {
	void play(II i) {
		i.play();
	}
}

class BBB implements II {

	@Override
	public void play() {
		System.out.println("play in B Class");
		
	}
}

class CCC implements II {
	
	@Override
	public void play() {
		System.out.println("play in C Class");
	}
	
}

public class InterfaceTest2 {

	public static void main(String[] args) {

		AAA a = new AAA();
		a.play(new BBB());
		a.play(new CCC());
		
	}

}
